import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static int[][] grid;
    private static boolean[][] visited;
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        grid = new int[N][N];

        int max = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                grid[i][j] = sc.nextInt();
                max = Math.max(max, grid[i][j]);
            }
        }
        int result = 1;

        for(int waterLevel=1; waterLevel<max; waterLevel++) {
            visited = new boolean[N][N];
            int cnt = 0;
            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    if(grid[i][j] > waterLevel && !visited[i][j]) {
                        bfs(i, j, waterLevel, N);
                        cnt++;
                    }
                }
            }
            result = Math.max(result, cnt);
        }
        System.out.println(result);
    }

    private static void bfs(int x, int y, int waterLevel, int N) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int curX = current[0];
            int curY = current[1];

            for(int i=0; i<4; i++) {
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];
                if(nextX>=0 && nextX<N && nextY>=0 && nextY<N && grid[nextX][nextY] > waterLevel && !visited[nextX][nextY]) {
                    queue.offer(new int[]{nextX, nextY});
                    visited[nextX][nextY] = true;
                }
            }
        }
    }
}
