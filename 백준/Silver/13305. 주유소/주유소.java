import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] distance = new int[N-1];
        int[] cost = new int[N];

        for(int i=0; i<N-1; i++) {
            distance[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++) {
            cost[i] = sc.nextInt();
        }

        int sum = 0;
        int min = cost[0];

        for(int i=0; i<N-1; i++) {
            if(cost[i] < min) {
                min = cost[i];
            }

            sum += min * distance[i];
        }

        System.out.println(sum);
    }
}