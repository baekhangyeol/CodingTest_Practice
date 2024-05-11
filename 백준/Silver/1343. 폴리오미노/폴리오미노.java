import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String res = "";

        String A = "AAAA", B = "BB";

        s = s.replaceAll("XXXX", A);
        s = s.replaceAll("XX", B);

        if(s.contains("X")) {
            s = "-1";
        }

        System.out.println(s);
    }
}