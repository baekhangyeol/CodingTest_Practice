import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] alphabet = new String[S.length()];
        int count = 0;

        for (int i = 0; i < S.length(); i++) {
            alphabet[i] = String.valueOf(S.charAt(i));
        }

        for (int i = 0; i < alphabet.length; i++) {
            if (i + 1 < alphabet.length) { // 배열 인덱스 초과를 방지하기 위해 i + 1을 검사
                if (alphabet[i].equals("l") && alphabet[i + 1].equals("j")) {
                    i++;
                } else if (alphabet[i].equals("c") && alphabet[i + 1].equals("=")) {
                    i++;
                } else if (alphabet[i].equals("z")) {
                    if (i + 1 < alphabet.length && alphabet[i + 1].equals("=")) {
                        i++;
                    }
                } else if (alphabet[i].equals("c") && alphabet[i + 1].equals("-")) {
                    i++;
                } else if (alphabet[i].equals("d") && i + 2 < alphabet.length && alphabet[i + 1].equals("z") && alphabet[i + 2].equals("=")) {
                    i += 2;
                } else if (alphabet[i].equals("d") && alphabet[i + 1].equals("-")) {
                    i++;
                } else if (alphabet[i].equals("n") && alphabet[i + 1].equals("j")) {
                    i++;
                } else if (alphabet[i].equals("s") && alphabet[i + 1].equals("=")) {
                    i++;
                }
            }
            count++;
        }

        System.out.println(count);

    }
}
