import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int second = 0;

        for(int i=0; i<S.length(); i++) {
            String a = String.valueOf(S.charAt(i));

            if (a.equals("A") || a.equals("B") || a.equals("C")) {
                second += 3;
            } else if (a.equals("D") || a.equals("E") || a.equals("F")) {
                second += 4;
            } else if (a.equals("G") || a.equals("H") || a.equals("I")) {
                second += 5;
            } else if (a.equals("J") || a.equals("K") || a.equals("L")) {
                second += 6;
            } else if (a.equals("M") || a.equals("N") || a.equals("O")) {
                second += 7;
            } else if (a.equals("P") || a.equals("Q") || a.equals("R") || a.equals("S")) {
                second += 8;
            } else if (a.equals("T") || a.equals("U") || a.equals("V")) {
                second += 9;
            } else if (a.equals("W") || a.equals("X") || a.equals("Y") || a.equals("Z")) {
                second += 10;
            }
        }
        System.out.println(second);
    }
}
