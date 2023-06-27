import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine() + "\n";

            for (char ch : str.toCharArray()) {
                if (ch == '(') {
                    stack.push('(');
                } else if (ch == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        stack.push(')');
                        break;
                    }
                }
            }
            if (stack.isEmpty()) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
    }
}
