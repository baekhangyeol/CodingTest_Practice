import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int screen[] = new int[N];
        int basket[] = new int[M];
        int left = 0, right = left + M - 1;

        int j = sc.nextInt();

        int distance = 0;

        for(int i=0; i<j; i++) {
           int apple = sc.nextInt() - 1;

           if(apple < left) {
               int different = left - apple;
               distance += different;

               left -= different;
               right -= different;
           } else if (apple > right) {
               int diffrent = apple - right;
               distance += diffrent;

               right += diffrent;
               left += diffrent;
           }
        }
        System.out.println(distance);
    }
}