import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int king = sc.nextInt();
        int queen = sc.nextInt();
        int look = sc.nextInt();
        int bishop = sc.nextInt();
        int knight = sc.nextInt();
        int pone = sc.nextInt();

        int kingExist = 1 - king;
        int queenExist = 1 - queen;
        int lookExist = 2 - look;
        int bishopExist = 2 - bishop;
        int knightExist = 2 - knight;
        int poneExist = 8 - pone;

        System.out.println(kingExist+" "+queenExist+" "+lookExist+" "+bishopExist+" "+knightExist+" "+poneExist);
    }
}