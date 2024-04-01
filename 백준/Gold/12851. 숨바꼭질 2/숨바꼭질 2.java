import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static final int MAX = 1000000;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        if (N >= K) {
            System.out.println(N - K);
            System.out.println(1);
            return;
        }

        int[] visited = new int[MAX + 1];
        Arrays.fill(visited, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);
        visited[N] = 0;

        int countWays = 0;
        int minTime = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if(current == K) {
                minTime = visited[current];
                countWays++;
            }

            int[] nextPositions = new int[]{current - 1, current + 1, current * 2};
            for(int nextPosition : nextPositions) {
                if(nextPosition>=0 && nextPosition <= MAX) {
                    if(visited[nextPosition] == -1) {
                        visited[nextPosition] = visited[current] + 1;
                        queue.add(nextPosition);
                    } else if(visited[nextPosition] == visited[current] + 1) {
                        queue.add(nextPosition);
                    }
                }
            }
        }

        System.out.println(minTime);
        System.out.println(countWays);
    }
}
