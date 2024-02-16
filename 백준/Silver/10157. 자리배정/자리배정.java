import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();
        int R = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        if(K > C * R) {
            System.out.println(0);
            return;
        }

        boolean[][] visited = new boolean[R+1][C+1];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int x = 1, y = 1, d = 0;

        int seatNumber = 1;

        while(seatNumber < K) {
            visited[y][x] = true;

            int nx = x + dx[d];
            int ny = y + dy[d];

            if(nx > C || ny > R || nx < 1 || ny < 1 || visited[ny][nx]) {
                d = (d + 1) % 4;
                nx = x + dx[d];
                ny = y + dy[d];
            }

            x = nx;
            y = ny;
            seatNumber++;
        }
        System.out.println(x + " " + y);
    }
}