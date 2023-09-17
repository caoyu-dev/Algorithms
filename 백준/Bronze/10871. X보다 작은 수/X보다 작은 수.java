import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int X = Integer.parseInt(str[1]);
        String[] str1 = br.readLine().split(" ");
        int[] list = new int[N + 1];

        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(str1[i]);
        }
        for (int i = 0; i < N; i++) {
            if (list[i] < X) {
                bw.write(list[i] + " ");
            }
        }
        bw.flush();
    }
}
