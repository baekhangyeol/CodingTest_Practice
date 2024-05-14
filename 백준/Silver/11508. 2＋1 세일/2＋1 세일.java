import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer milks[] = new Integer[N];

        for(int i=0; i<N; i++) {
            milks[i] = sc.nextInt();
        }

        long sum = 0;

        Arrays.sort(milks, Collections.reverseOrder());

        for(int i=2; i<N; i = i+3) {
            milks[i] = 0;
        }

        for(int i=0; i<N; i++) {
            sum += milks[i];
        }

        System.out.println(sum);
    }
}