import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] time = new Integer[N];

        for(int i=0; i<N; i++) {
            time[i] = sc.nextInt();
        }

        Arrays.sort(time);
        int sum = 0;
        int next = 0;

        for(int i=0; i<N; i++) {
            next += time[i];
            sum += next;
        }

        System.out.println(sum);
    }
}