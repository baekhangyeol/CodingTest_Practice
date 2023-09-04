import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int a_Hundred = A / 100;
        int a_tenth = A / 10 - a_Hundred*10;
        int a_oneth = A - a_Hundred*100 - a_tenth*10;
        int b_Hundred = B / 100;
        int b_tenth = B / 10 - b_Hundred*10;
        int b_oneth = B - b_Hundred*100 - b_tenth*10;

        int resultA = a_oneth*100 + a_tenth*10 + a_Hundred;
        int resultB = b_oneth*100 + b_tenth*10 + b_Hundred;

        if(resultA > resultB) {
            System.out.println(resultA);
        }
        else {
            System.out.println(resultB);
        }
    }
}