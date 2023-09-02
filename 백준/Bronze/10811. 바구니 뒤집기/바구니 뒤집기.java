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
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j=a-1, k=b-1; j<=k; j++, k--) {
                int temp = baskets[j];
                baskets[j] = baskets[k];
                baskets[k] = temp;
            }
        }

        for(int i=0; i<N; i++) {
            System.out.print(baskets[i]+" ");
        }
    }
}
