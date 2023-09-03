import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int sum = 0;

        for(int i=0; i<N; i++) {
            char a = S.charAt(i);
            int n = Character.getNumericValue(a);
            sum += n;
        }
        System.out.print(sum);
    }
}