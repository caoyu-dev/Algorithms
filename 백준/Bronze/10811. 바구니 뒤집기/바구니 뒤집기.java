import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] list = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            list[i] = i;
        }
        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            for (int j = start; j < (start + end + 1) / 2; j++) {
                int tmp = list[j];
                list[j] = list[end - (j - start)];
                list[end - (j - start)] = tmp;
            }
        }

        for (int i = 1; i < N + 1; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
