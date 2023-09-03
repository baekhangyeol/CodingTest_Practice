import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        int wordCount = 0;

        while (sc.hasNextLine()) {
            line = sc.nextLine().trim();

            if (!line.isEmpty()) {
                String[] words = line.split(" ");
                wordCount += words.length;
            }
        }

        System.out.println(wordCount);
    }
}
