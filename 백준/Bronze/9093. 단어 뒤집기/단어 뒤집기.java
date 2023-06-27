import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            String str = sc.nextLine() + "\n";
            Stack<Character> stack = new Stack<>();
            for (char ch : str.toCharArray()) {
                if (ch == '\n' || ch == ' ') {
                    while (!stack.isEmpty()) {
                        bw.write(stack.pop());
                    }
                    bw.write(ch);
                } else {
                    stack.push(ch);
                }
            }
        }
        bw.flush();
    }
}
