import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for(int i=0; i<N; i++) {
            String S = sc.next();
            boolean[] visited = new boolean[26];
            boolean isGroupWord = true;

            for(int j=0; j<S.length(); j++) {
                char c = S.charAt(j);

                if(visited[c-'a']) {
                    if(j>0 && S.charAt(j-1) != c) {
                        isGroupWord = false;
                        break;
                    }
                }
                else {
                    visited[c-'a'] = true;
                }
            }
            if(isGroupWord) {
                count++;
            }
        }
        System.out.println(count);
    }
}
