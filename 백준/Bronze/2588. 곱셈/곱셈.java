import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        
        int hundredB, tenB, oneB;
        hundredB = b / 100;
        tenB = b / 10 - 10 * hundredB;
        oneB = b - (tenB * 10 + hundredB * 100);
        
        System.out.println(a * oneB);
        System.out.println(a * tenB);
        System.out.println(a * hundredB);
        System.out.println((a * oneB) + ((a * tenB) * 10) + ((a * hundredB) * 100));
    }
}