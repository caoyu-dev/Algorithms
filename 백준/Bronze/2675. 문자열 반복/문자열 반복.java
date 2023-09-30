import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R;
        String[] P;

        for (int i = 0; i < N; i++) {
            R = sc.nextInt();
            P = sc.next().split("");
            for (int j = 0; j < P.length; j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(P[j]);
                }
            }
            System.out.println();
        }
    }
}
