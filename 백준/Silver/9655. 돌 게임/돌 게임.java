import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 돌의 개수 N을 입력 받음
        int N = scanner.nextInt();
        
        // 돌의 개수에 따라 승자 결정
        // 돌의 개수가 홀수면 상근이(SK)가 이김, 짝수면 창영이(CY)가 이김
        if (N % 2 == 1) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}