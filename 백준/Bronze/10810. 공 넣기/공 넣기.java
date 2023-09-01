import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] baskets = new int[N];

        for(int i=0; i<M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            for(int j=a-1; j<b; j++) {
                baskets[j] = c;
            }
        }
        for(int b : baskets) {
            System.out.print(b + " ");
        }
    }
}