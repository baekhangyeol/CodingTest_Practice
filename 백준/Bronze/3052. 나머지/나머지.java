import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> remainders = new HashSet<>();

        for(int i=0; i<10; i++) {
            int num = sc.nextInt();
            int remainder = num % 42;
            remainders.add(remainder);
        }
        System.out.println(remainders.size());
    }
}
