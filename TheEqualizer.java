import java.util.*;
import java.io.*;

public class TheEqualizer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Long.parseLong(st.nextToken());
            }
            boolean win = (sum % 2 == 1) || (((long) n * k) % 2 == 0);
            sb.append(win ? "YES" : "NO").append('\n');
        }
        System.out.print(sb);
    }
}
