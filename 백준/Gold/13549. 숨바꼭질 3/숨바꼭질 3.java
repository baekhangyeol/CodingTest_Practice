import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(bfs(N, K));
    }

    public static int bfs(int N, int K) {
        int[] visited = new int[100001];
        Arrays.fill(visited, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);
        visited[N] = 0;

        while(!queue.isEmpty()) {
            int current = queue.poll();

            if(current == K) {
                return visited[current];
            }

            int[] nextPositions = {current*2, current-1, current+1};
            for(int next : nextPositions) {
                if(next >= 0 && next <= 100000) {
                    if(next == current*2 && visited[next] == -1) {
                        queue.offer(next);
                        visited[next] = visited[current];
                    } else if(visited[next] == -1) {
                        queue.offer(next);
                        visited[next] = visited[current] + 1;
                    }
                }
            }
        }
        return -1;
    }
}