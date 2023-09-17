import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] range = new int[N + 1];

        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int number = sc.nextInt();
            for (int j = start; j < end + 1; j++) {
                range[j] = number;
            }
        }
        for (int i = 1; i < N + 1; i++) {
            System.out.print(range[i] + " ");
        }
    }
}
