import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int i = sc.nextInt();

        String answer = String.valueOf(S.charAt(i-1));

        System.out.println(answer);

    }
}
