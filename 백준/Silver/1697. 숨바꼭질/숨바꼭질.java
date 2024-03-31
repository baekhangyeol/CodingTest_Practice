import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static final int MAX = 1000000;

    static class Node {
        int position;
        int time;

        Node(int position, int time) {
            this.position = position;
            this.time = time;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        boolean[] visited = new boolean[MAX + 1];
        int[] time = new int[MAX + 1];

        if(N >= K) {
            System.out.println(N - K);
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(N, 0));
        visited[N] = true;

        while(!queue.isEmpty()) {
            Node current = queue.remove();
            int currentPosition = current.position;
            int currentTime = current.time;

            if(currentPosition == K) {
                System.out.println(currentTime);
                break;
            }

            int[] nextPositions = new int[]{currentPosition - 1, currentPosition + 1, currentPosition * 2};

            for(int nextPosition : nextPositions) {
                if(nextPosition >= 0 && nextPosition <= MAX && !visited[nextPosition]) {
                    visited[nextPosition] = true;
                    time[nextPosition] = currentTime + 1;
                    queue.add(new Node(nextPosition, currentTime + 1));
                }
            }
        }
    }
}
