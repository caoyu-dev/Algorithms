import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int A, B;
        int[] sum = new int[T + 1];

        for (int i = 1; i < T + 1; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            sum[i] = A + B;
        }

        for (int i = 1; i < T + 1; i++) {
            System.out.println("Case #" + i + ": " + sum[i]);
        }
    }
}
