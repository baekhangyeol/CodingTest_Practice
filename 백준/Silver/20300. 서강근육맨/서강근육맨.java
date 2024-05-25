import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] weight = new long[N];
        for(int i=0; i<N; i++) {
            weight[i] = sc.nextLong();
        }
        Arrays.sort(weight);

        long max = 0;

        if(N % 2 == 0) {
            for(int i=0; i<N/2; i++) {
                max = Math.max(max, weight[i] + weight[N-1-i]);
            }
        } else {
            max = weight[N-1];
            for (int i=0; i<(N-1)/2; i++) {
                max = Math.max(max, weight[i] + weight[N - 2 - i]);
            }
        }

        System.out.println(max);
    }
}