import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 9;
        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int max = list[0];
        int index = 1;
        for (int i = 0; i < N; i++) {
            if (max < list[i]) {
                max = list[i];
                index = i + 1;
            }
        }
        System.out.println(max + "\n" + index);
    }
}
