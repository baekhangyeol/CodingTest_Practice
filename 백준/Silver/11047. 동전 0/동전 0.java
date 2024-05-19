import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Integer[] value = new Integer[N];

        for(int i=0; i<N; i++) {
            value[i] = sc.nextInt();
        }

        Arrays.sort(value, Collections.reverseOrder());
        int count = 0;

        for(int i=0; i<N; i++) {
            if(value[i] <= K) {
                count += (K / value[i]);
                K = K % value[i];
            }
        }
        System.out.println(count);
    }
}