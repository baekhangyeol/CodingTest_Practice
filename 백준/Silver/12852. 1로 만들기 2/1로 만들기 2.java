import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] dp = new int[N+1];
        int[] path = new int[N+1];

        dp[1] = 0;

        for(int i=2; i<=N; i++) {
            dp[i] = dp[i-1] + 1;
            path[i] = i - 1;

            if(i % 2 == 0 && dp[i] > dp[i / 2] + 1) {
                dp[i] = dp[i / 2] + 1;
                path[i] = i / 2;
            }

            if(i % 3 == 0 && dp[i] > dp[i / 3] + 1) {
                dp[i] = dp[i / 3] + 1;
                path[i] = i / 3;
            }
        }

        System.out.println(dp[N]);

        ArrayList<Integer> result = new ArrayList<>();
        for(int i=N; i != 0; i=path[i]) {
            result.add(i);
        }

        for(int i=0; i<result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
