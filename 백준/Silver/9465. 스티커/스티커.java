import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i=0; i<T; i++) {
            int n = sc.nextInt();
            int[][] stickers = new int[2][n];
            int[][] dp = new int[2][n];

            for(int j=0; j<2; j++) {
                for(int k=0; k<n; k++) {
                    stickers[j][k] = sc.nextInt();
                }
            }

            dp[0][0] = stickers[0][0];
            dp[1][0] = stickers[1][0];

            for(int j=1; j<n; j++) {
                dp[0][j] = Math.max(dp[1][j-1], j > 1 ? dp[1][j-2] : 0) + stickers[0][j];
                dp[1][j] = Math.max(dp[0][j-1], j > 1 ? dp[0][j-2] : 0) + stickers[1][j];
            }

            System.out.println(Math.max(dp[0][n-1], dp[1][n-1]));
        }
        sc.close();
    }
}