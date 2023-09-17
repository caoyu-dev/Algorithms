import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = 30;
        int M = 28;
        int[] list = new int[N + 1];
        String input;

        for (int i = 1; i < N + 1; i++) {
            list[i] = i;
        }
        for (int i = 0; i < M; i++) {
            int str = Integer.parseInt(br.readLine());
            list[str] = 0;
        }
        for (int i = 1; i < N + 1; i++) {
            if (list[i] != 0) {
                bw.write(list[i] + "\n");
            }
        }
        bw.flush();
    }
}
