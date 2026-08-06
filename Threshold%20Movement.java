import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long low = 1;
            long high = 1000000001L;

            for (int i = 1; i <= n; i++) {
                long w = Long.parseLong(st.nextToken());
                if (i % 2 == 1) { // odd positions must move right
                    high = Math.min(high, w - 1);
                } else { // even positions must move left
                    low = Math.max(low, w + 1);
                }
            }
            out.append(low <= high ? "YES" : "NO").append('\n');
        }
        System.out.print(out.toString());
    }
}
