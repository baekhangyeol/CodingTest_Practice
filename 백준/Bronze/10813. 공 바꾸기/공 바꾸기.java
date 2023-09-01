import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] baskets = new int[N];

        for(int i=0; i<N; i++) {
            baskets[i] = i+1;
        }

        for(int i=0; i<M; i++) {
            int num = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();

            num = baskets[a-1];
            baskets[a-1] = baskets[b-1];
            baskets[b-1] = num;
        }
        for(int b : baskets) {
            System.out.print(b + " ");
        }
    }
}