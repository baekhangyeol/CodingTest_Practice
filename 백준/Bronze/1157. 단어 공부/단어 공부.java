import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine().toLowerCase();

        int[] alphabetCount = new int[26];

        for(int i=0; i<S.length(); i++) {
            char c = S.charAt(i);
            if(Character.isAlphabetic(c)) {
                alphabetCount[c-'a']++;
            }
        }

        char mostFrequent = '?';
        int maxCount = 0;

        for(int i=0; i<26; i++) {
            if(alphabetCount[i] > maxCount) {
                maxCount = alphabetCount[i];
                mostFrequent = (char) ('A'+i);
            }
            else if(alphabetCount[i] == maxCount) {
                mostFrequent = '?';
            }
        }
        System.out.println(mostFrequent);
    }
}