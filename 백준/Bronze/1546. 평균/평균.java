import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double avg = 0;
        int max = -1;

        int[] score = new int[N];

        for(int i=0; i<N; i++) {
           score[i]=  sc.nextInt();

            if(score[i] > max) {
                max = score[i];
            }
        }

        for(int i=0; i<N; i++) {
            double scores = (double)score[i] / max * 100;
            avg += scores;
        }

        System.out.println(avg/N);
    }
}
