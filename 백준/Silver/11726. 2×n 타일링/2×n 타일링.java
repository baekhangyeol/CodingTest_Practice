import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] dp = new int[N+1];
        
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i=2; i<=N; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }
        
        System.out.println(dp[N]);
    }
}