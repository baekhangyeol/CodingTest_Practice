import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] L = new int[N];
        int[] J = new int[N];
        int[] dp = new int[101];

        for(int i=0; i<N; i++) {
            L[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++) {
            J[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++) {
            for(int h=100; h - L[i] > 0; h--) {
                dp[h] = Math.max(dp[h], dp[h-L[i]] + J[i]);
            }
        }

        int maxJoy = 0;
        for(int i=1; i<=100; i++) {
            maxJoy = Math.max(maxJoy, dp[i]);
        }

        System.out.println(maxJoy);
    }
}