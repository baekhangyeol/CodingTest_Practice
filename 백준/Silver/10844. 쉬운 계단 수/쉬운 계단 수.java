import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        long[][] dp = new long[N + 1][10];

        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for (int length = 2; length <= N; length++) {
            for (int digit = 0; digit <= 9; digit++) {
                if (digit == 0) {
                    dp[length][digit] = dp[length - 1][1];
                } else if (digit == 9) {
                    dp[length][digit] = dp[length - 1][8];
                } else {
                    dp[length][digit] = (dp[length - 1][digit - 1] + dp[length - 1][digit + 1]) % 1_000_000_000;
                }
            }
        }

        long total = 0;
        for (int i = 0; i <= 9; i++) {
            total = (total + dp[N][i]) % 1_000_000_000;
        }

        System.out.println(total);
    }
}
