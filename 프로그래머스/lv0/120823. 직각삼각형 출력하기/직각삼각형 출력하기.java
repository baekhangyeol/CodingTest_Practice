import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            int star = i;
            for(int j=1; j<=star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}