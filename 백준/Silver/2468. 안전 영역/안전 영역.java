import java.util.Scanner;

public class Main {
    static int[][] area;
    static boolean[] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        area = new int[N][N];

        int maxHeight = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                area[i][j] = sc.nextInt();
                maxHeight = Math.max(maxHeight, area[i][j]);
            }
        }

        int maxSafeAreas = 0;
        for(int height = 0; height<= maxHeight; height++) {
            visited = new boolean[N*N];
            int safeAreas = 0;

            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    if(area[i][j] > height && !visited[i*N+j]) {
                        dfs(i, j, height);
                        safeAreas++;
                    }
                }
            }
            maxSafeAreas = Math.max(maxSafeAreas, safeAreas);
        }
        System.out.println(maxSafeAreas);
    }

    static void dfs(int x, int y, int height) {
        visited[x*N+y] = true;

        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if(area[nx][ny] > height && !visited[nx*N+ny]) {
                    dfs(nx, ny, height);
                }
            }
        }
    }
}