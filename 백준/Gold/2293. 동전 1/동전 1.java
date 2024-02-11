import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        int[] coins = new int[N];
        int[] dp = new int[K+1];
        
        for(int i=0; i<N; i++) {
            coins[i] = scanner.nextInt();
        }
        
        dp[0] = 1;
        
        for(int i=0; i<N; i++) {
            for(int j=coins[i]; j<=K; j++) {
                dp[j] += dp[j-coins[i]];
            }
        }
        
        System.out.println(dp[K]);
    }
}