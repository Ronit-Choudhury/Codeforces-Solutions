import java.util.*;
import java.io.*;

public class BingoCandies {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            HashMap<Integer, Integer> freq = new HashMap<>();
            int maxFreq = 0;
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    int v = Integer.parseInt(st.nextToken());
                    int f = freq.merge(v, 1, Integer::sum);
                    if (f > maxFreq) maxFreq = f;
                }
            }
            boolean ok = maxFreq <= (long) n * (n - 1);
            sb.append(ok ? "YES" : "NO").append('\n');
        }
        System.out.print(sb);
    }
}
