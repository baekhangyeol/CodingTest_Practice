import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static int[][] maze;
    private static boolean[][] visited;
    private static int N, M;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        maze = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++) {
            String line = sc.next();
            for(int j=0; j<M; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        int minimumPath = bfs(0, 0);
        System.out.println(minimumPath);
    }

    private static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y, 1});
        visited[x][y] = true;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int curX = current[0];
            int curY = current[1];
            int count = current[2];

            if(curX == N-1 && curY == M-1) {
                return count;
            }

            for(int i=0; i<4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if(nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if(maze[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.offer(new int[]{nx, ny, count+1});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return -1;
    }
}
