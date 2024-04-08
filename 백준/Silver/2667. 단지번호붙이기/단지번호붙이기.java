import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N, count;
    static ArrayList<Integer> houseCounts = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        visited = new boolean[N][N];

        for(int i=0; i<N; i++) {
            String line = sc.next();
            for(int j=0; j<N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    count = 0;
                    dfs(i, j);
                    houseCounts.add(count);
                }
            }
        }

        Collections.sort(houseCounts);
        System.out.println(houseCounts.size());
        for(int c : houseCounts) {
            System.out.println(c);
        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;
        count++;

        for(int i=0; i<4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if(nextX >= 0 && nextY >= 0 && nextX < N && nextY < N) {
                if(map[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    dfs(nextX, nextY);
                }
            }
        }
    }
}