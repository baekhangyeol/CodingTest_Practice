import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        int price = 0;
        
        if(a == b && b == c) {
            price = 10000 + (a * 1000);
        }
        else if((a == b && a != c) || (a == c && a != b) || (b == c && a != b)) {
            if(a == b || a == c) {
                price = 1000 + a * 100;
            }
            else if(b == c) {
                price = 1000 + b * 100;
            }
        }
        else if(a != b && b != c) {
            if(a > b && a > c) {
                price = a * 100;
            }
            else if(b > a && b > c) {
                price = b * 100;
            }
            else if(c > a && c > b) {
                price = c * 100; 
            }
        }
        System.out.println(price);
    }
}