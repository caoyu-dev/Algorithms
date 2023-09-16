import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        int N = sc.nextInt();
        int[] totalList = new int[N];
        int price = 0;
        int count = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            price = sc.nextInt();
            count = sc.nextInt();
            totalList[i] = price * count;
        }

        for (int i = 0; i < N; i++) {
           sum += totalList[i];
        }

        if (X == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
