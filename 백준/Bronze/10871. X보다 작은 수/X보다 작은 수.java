import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        sc.nextLine();

        String[] array = sc.nextLine().split(" ");
        int count = 0;

        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(array[i]);
            if(num < X) {
                count++;
            }
        }

        int[] answer = new int[count];

        int index = 0;

        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(array[i]);
            if(num < X) {
                answer[index] = num;
                index++;
            }
        }

        for(int i=0; i<count; i++) {
            System.out.print(answer[i]+" ");
        }

    }
}