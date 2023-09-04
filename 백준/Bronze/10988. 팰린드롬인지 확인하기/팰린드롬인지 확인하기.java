import java.util.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] answer = new String[S.length()];
        int count = 0;

        for(int i=0; i<S.length(); i++) {
            answer[i] = String.valueOf(S.charAt(i));
        }

        boolean isSymmetric = true;

        for (int i = 0, j = S.length()-1; i < S.length()/2; i++, j--) {
            if(!answer[i].equals(answer[j])) {
                isSymmetric = false;
                break;
            }
        }
        if(isSymmetric) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}