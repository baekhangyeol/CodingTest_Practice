import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static char[][] grid;
    static boolean[][] visited;
    static int N;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static ArrayList<Integer> areaSizes = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();

        grid = new char[N][N];
        for(int i=0; i<N; i++) {
            String line = sc.nextLine();
            for(int j=0; j<N; j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        System.out.println(countRegions(false) + " " + countRegions(true));
    }

    static int countRegions(boolean colorBlind) {
        visited = new boolean[N][N];
        int count = 0;

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(!visited[i][j]) {
                    dfs(i, j, grid[i][j], colorBlind);
                    count++;
                }
            }
        }
        return count;
    }

    static void dfs(int x, int y, char color, boolean colorBlind) {
        visited[x][y] = true;
        for(int i=0; i<4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if(nextX >= 0 && nextY >= 0 && nextX < N && nextY < N && !visited[nextX][nextY]) {
                if(colorBlind && (grid[nextX][nextY] == 'R' || grid[nextX][nextY] == 'G')) {
                    if(color == 'R' || color == 'G') {
                        dfs(nextX, nextY, color, colorBlind);
                    }
                } else if(grid[nextX][nextY] == color) {
                    dfs(nextX, nextY, color, colorBlind);
                }
            }
        }
    }
}