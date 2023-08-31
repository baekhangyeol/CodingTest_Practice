import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        int minutes = a * 60 + b + c;
        
        int hour = minutes / 60;
        int minute = minutes % 60;
        
        if(hour >= 24) {
            hour -= 24;
        }
        
        System.out.println(hour+" "+minute);
    }
}