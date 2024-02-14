import java.util.*;

public class Main {
    static int M, N, K;
    static boolean[][] visited;
    static int[][] paper;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        M = scanner.nextInt();
        N = scanner.nextInt();
        K = scanner.nextInt();

        visited = new boolean[M][N];
        paper = new int[M][N];

        for(int i=0; i<K; i++) {
            int lx = scanner.nextInt();
            int ly = scanner.nextInt();
            int rx = scanner.nextInt();
            int ry = scanner.nextInt();

            for(int y=ly; y<ry; y++) {
                for(int x=lx; x<rx; x++) {
                    paper[y][x] = 1;
                }
            }
        }
        ArrayList<Integer> areas = new ArrayList<>();

        for(int y=0; y<M; y++) {
            for(int x=0; x<N; x++) {
                if(paper[y][x] == 0 && !visited[y][x]) {
                    areas.add(bfs(x, y));
                }
            }
        }

        Collections.sort(areas);
        System.out.println(areas.size());
        for(int area : areas) {
            System.out.print(area + " ");
        }
    }

    public static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[y][x] = true;
        int area = 0;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            area++;

            for(int i=0; i<4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M && !visited[ny][nx] && paper[ny][nx] == 0) {
                    queue.add(new int[]{nx, ny});
                    visited[ny][nx] = true;
                }
            }
        }
        return area;
    }
}