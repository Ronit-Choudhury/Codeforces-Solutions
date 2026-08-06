import java.util.*;
import java.io.*;

public class DisturbingDistribution {

    static final long MOD = 676767677L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

            long total = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] >= 2) total += a[i];
            }
            if (a[n - 1] == 1) total += 1;

            total %= MOD;
            sb.append(total).append('\n');
        }

        System.out.print(sb);
    }
}
