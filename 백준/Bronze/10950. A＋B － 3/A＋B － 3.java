import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] n = new int[count];
        int[] m = new int[count];

        for (int i = 0; i < count; i++) {
            n[i] = sc.nextInt();
            m[i] = sc.nextInt();
        }

        for (int i = 0; i < count; i++) {
            System.out.println(n[i] + m[i]);
        }
    }
}
