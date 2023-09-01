import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[9];
        int max = -1;
        int index = -1;

        for(int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();

            if(array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index+1);
    }
}