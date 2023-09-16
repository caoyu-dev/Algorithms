import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int A, B;
        int[] sum = new int[count];

        for (int i = 0 ; i < count; i++) {
            String[] numbers = br.readLine().split(" ");
            A = Integer.parseInt(numbers[0]);
            B = Integer.parseInt(numbers[1]);
            sum[i] = A + B;
        }

        for (int i = 0; i < count; i++) {
            bw.write(sum[i] + "\n");
        }
        bw.flush();
    }
}
