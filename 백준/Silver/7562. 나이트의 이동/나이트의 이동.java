import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static int l;
    private static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    private static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=0; t<T; t++) {
            l = sc.nextInt();
            int startX = sc.nextInt();
            int startY = sc.nextInt();
            int endX = sc.nextInt();
            int endY = sc.nextInt();

            System.out.println(bfs(startX, startY, endX, endY));
        }
    }

    private static int bfs(int x, int y, int targetX, int targetY) {

        boolean[][] visited = new boolean[l][l];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y, 0});
        visited[x][y] = true;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int curX = current[0];
            int curY = current[1];
            int count = current[2];

            if(curX == targetX && curY == targetY) {
                return count;
            }

            for(int i=0; i<8; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if(nx >= 0 && ny >= 0 && nx < l && ny < l && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, count + 1});
                }
            }
        }
        return -1;
    }
}
