import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();

        while (sum > 4) {
            sum -= 4;
            System.out.print("long ");
        }
        System.out.println("long int");
    }
}
