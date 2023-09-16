import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int A, B;
        int[] left = new int[T];
        int[] right = new int[T];

        for (int i = 0; i < T; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            left[i] = A;
            right[i] = B;
        }

        for (int i = 0; i < T; i++) {
            System.out.println("Case #" + (i + 1) + ": " + left[i] + " + " + right[i] + " = " + (left[i] + right[i]));
        }
    }
}
