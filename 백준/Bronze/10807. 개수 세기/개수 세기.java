import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        int idx = 0;

        for (int i = 0; i < N; i++) {
            if (v == list[i]) {
                idx++;
            }
        }
        System.out.println(idx);
    }
}
