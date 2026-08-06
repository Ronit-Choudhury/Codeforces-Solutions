import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            int x = 1;
            while (cnt < n) {
                if (x % 3 != 0) {
                    out.append(x).append(" ");
                    cnt++;
                }
                x++;
            }
            out.append('\n');
        }

        System.out.print(out);
    }
}
