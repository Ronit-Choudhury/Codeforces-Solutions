import java.util.*;
import java.io.*;

public class FlipFlops {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            long[] a = new long[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }
            Arrays.sort(a);
            for (int i = 0; i < n; i++) {
                if (a[i] <= c) {
                    long pump = Math.min(k, c - a[i]);
                    long effective = a[i] + pump;
                    c += effective;
                    k -= pump;
                } else {
                    break;
                }
            }
            sb.append(c).append('\n');
        }
        System.out.print(sb);
    }
}
