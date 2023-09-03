import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int[] firstOccur = new int[26];

        for(int i=0; i<26; i++) {
            firstOccur[i] = -1;
        }

        for(int i=0; i<S.length(); i++) {
            char c = S.charAt(i);
            int index = c - 'a';
            if(firstOccur[index] ==-1) {
                firstOccur[index] = i;
            }
        }

        for(int i=0; i<26; i++) {
            System.out.print(firstOccur[i]+" ");
        }
    }
}