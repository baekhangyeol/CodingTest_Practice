import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] weights = new int[N];

        for(int i = 0; i < N; i++) {
            weights[i] = scanner.nextInt();
        }

        Arrays.sort(weights);

        int sum = 0;

        for(int i=0; i<N; i++) {
            if(sum + 1 < weights[i]) {
                break;
            }
            sum += weights[i];
        }
        System.out.println(sum + 1);
    }
}