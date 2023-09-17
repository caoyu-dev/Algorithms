import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] list = new int[N + 1];
        int A, B;

        for (int i = 1; i < N + 1; i++) {
            list[i] = i;
        }

        for (int i = 0; i < M; i++) {
            A = sc.nextInt();
            B = sc.nextInt();

            int tmp = list[A];
            list[A] = list[B];
            list[B] = tmp;
        }
        for (int i = 1; i < N + 1; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
