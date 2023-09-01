import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        String[] array = sc.nextLine().split(" ");

        int v = sc.nextInt();
        int count = 0;

        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(array[i]);
            if(num == v) {
                count++;
            }
        }

        System.out.println(count);

    }
}