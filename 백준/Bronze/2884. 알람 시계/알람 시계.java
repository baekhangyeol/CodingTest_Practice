import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a == 0) {
            a = 24;
        }
        int minutes = (a * 60 + b) - 45;
        
        int hour = minutes / 60;
        int minute = minutes % 60;
        
        if(hour == 24) {
            hour = 0;
        }
        
        System.out.println(hour+" "+minute);
    }
}