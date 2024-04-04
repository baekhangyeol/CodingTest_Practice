import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[][] graph;
    static boolean[] visited;
    static int[][] result;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        graph = new int[N][N];
        result = new int[N][N];

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<N; i++) {
            visited = new boolean[N];
            dfs(i ,i);
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void dfs(int start, int current) {
        for(int next=0; next<N; next++) {
            if(!visited[next] && graph[current][next] == 1) {
                visited[next] = true;
                result[start][next] = 1;
                dfs(start, next);
            }
        }
    }
}