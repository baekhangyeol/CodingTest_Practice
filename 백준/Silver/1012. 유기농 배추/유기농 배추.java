import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static int M, N, K;
    private static int[][] field;
    private static boolean[][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=0; t<T; t++) {
            M = sc.nextInt();
            N = sc.nextInt();
            K = sc.nextInt();

            field = new int[M][N];
            visited = new boolean[M][N];

            for(int i=0; i<K; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                field[x][y] = 1;
            }

            int wormCount = 0;
            for(int i=0; i<M; i++) {
                for(int j=0; j<N; j++) {
                    if(field[i][j] == 1 && !visited[i][j]) {
                        bfs(i, j);
                        wormCount++;
                    }
                }
            }

            System.out.println(wormCount);
        }
    }

    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int curX = current[0];
            int curY = current[1];

            for(int i=0; i<4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if(nx >=0 && ny >= 0 && nx < M && ny < N) {
                    if(field[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
    }
}
