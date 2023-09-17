import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = IntStream.range(0, N)
                .map(i -> sc.nextInt())
                .toArray();
        int v = sc.nextInt();

        long count = IntStream.of(list)
                .filter(num -> num == v)
                .count();

        System.out.println(count);
    }
}
