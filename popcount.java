import java.io.*;
import java.util.*;
class popcount {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());

            long ans = 0;
            long cost = 1;

            while (cost <= n) {
                long take = Math.min(k, n / cost);
                ans += take;
                n -= take * cost;

                if (take < k) break;
                cost <<= 1;
            }

            out.append(ans).append('\n');
        }

        System.out.print(out);
    }
}