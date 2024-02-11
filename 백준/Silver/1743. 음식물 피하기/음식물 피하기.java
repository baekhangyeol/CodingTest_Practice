import java.util.*;

public class Main {
    static int[][] grid;
    static boolean[][] visited;
    static int N, M;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        int K = scanner.nextInt();
        
        grid = new int[N][M];
        visited = new boolean[N][M];
        
        for(int i=0; i<K; i++) {
            int r = scanner.nextInt() - 1;
            int c = scanner.nextInt() - 1;
            grid[r][c] = 1;
        }
        
        int maxTrash = 0;
        
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(grid[i][j] == 1 && !visited[i][j]) {
                    maxTrash = Math.max(maxTrash, dfs(i, j));
                }
            }
        }
        
        System.out.println(maxTrash);
    }
    
    static int dfs(int x, int y) {
        visited[x][y] = true;
        int count = 1;
        
        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx >= 0 && nx < N && ny >= 0 && ny < M) {
                if(grid[nx][ny] == 1 && !visited[nx][ny]) {
                    count += dfs(nx, ny);
                }
            }
        }
        return count;
    }
}