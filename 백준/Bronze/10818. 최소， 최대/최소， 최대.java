import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        String[] array = sc.nextLine().split(" ");
        int[] array2 = new int[N];

        for(int i=0; i<N; i++) {
            array2[i] = Integer.parseInt(array[i]);
        }

        int min = array2[0];
        int max = array2[0];

        for(int i=1; i<N; i++) {
            int num = array2[i];

            if(num < min) {
                min = num;
            }

            if(num > max) {
                max = num;
            }
        }
        System.out.println(min+" "+max);
    }
}