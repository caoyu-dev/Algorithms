import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 10;
        int division = 42;
        int A;
        int[] list = new int[N];
        int uniqueCount = 0;

        for (int i = 0; i < N; i++) {
            A = sc.nextInt();
            list[i] = A % division;
        }
        for (int i = 0; i < N; i++) {
            if (list[i] != -1) {
                uniqueCount++;
                for (int j = i + 1; j < N; j++) {
                    if (list[i] == list[j]) {
                        list[j] = -1;
                    }
                }
            }
        }
        System.out.println(uniqueCount);
    }
}
