import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // 주사위 세 개가 같은 경우
        if (A == B && A == C && B == C) {
            int prize = 10000 + A * 1000;
            System.out.println(prize);
        }

        // 주사위 두 개가 같은 경우
        // A, B 가 같고 C 가 다른 경우
        if (A == B && A != C) {
            int prize = 1000 + A * 100;
            System.out.println(prize);
        }
        // A, C 가 같고 B 가 다른 경우
        if (A == C && A != B) {
            int prize = 1000 + A * 100;
            System.out.println(prize);
        }
        // B, C 가 같고 A 가 다른 경우
        if (B == C && A != B) {
            int prize = 1000 + B * 100;
            System.out.println(prize);
        }

        // 모두 다른 눈이 나온 경우 그중 가장 큰 눈에 100을 곱하여 상금을 받는다
        if (A != B && A != C && B != C) {
            int big = A;
            if (big <= B) {
                big = B;
                if (big <= C) {
                    big = C;
                }
            } else {
                if (big <= C) {
                    big = C;
                }
            }
            int prize = big * 100;
            System.out.println(prize);
        }
    }
}
