import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++) {
            String S = sc.next();

            char first = S.charAt(0);
            char last = S.charAt(S.length()-1);

            sb.append(first).append(last).append('\n');
        }

        System.out.print(sb.toString());
    }
}
