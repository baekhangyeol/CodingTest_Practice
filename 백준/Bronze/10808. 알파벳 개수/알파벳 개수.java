import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine().toLowerCase();

        int count[] = new int[26];

        for(int i=0; i< S.length(); i++) {
            char c = S.charAt(i);

            if ('a' <= c && c <= 'z') {
                int index = c - 'a';
                count[index]++;
            }
        }

        for(int i=0; i<26; i++) {
            System.out.print(count[i]);
            if(i < 25) {
                System.out.print(" ");
            }
        }
    }
}