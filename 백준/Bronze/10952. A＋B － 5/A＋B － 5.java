import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A, B;

        while (true) {
            String[] numbers = br.readLine().split(" ");
            A = Integer.parseInt(numbers[0]);
            B = Integer.parseInt(numbers[1]);
            if (A == 0 && B == 0) {
                break;
            }
            bw.write(A + B + "\n");
        }
        bw.flush();
    }
}
