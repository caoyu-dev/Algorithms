import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String str = Integer.toString(m);

        int sum = 0;
        int square = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int multiply = Character.getNumericValue(ch);
            int result = n * multiply;
            int calc = (int) (result * Math.pow(10, square));

            System.out.println(result);
            sum += calc;
            square++; // 제곱
        }
        System.out.println(sum);
    }
}
