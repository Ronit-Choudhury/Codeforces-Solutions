import java.util.*;
import java.io.*;

public class AArrayColoring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            // Since the values form a permutation of 1..n, the sorted order
            // is 1,2,...,n, so consecutive sorted elements always differ in
            // parity. This forces the coloring to be exactly "color by
            // parity of value". We just need to check the original row also
            // has alternating parity between adjacent cards.
            boolean ok = true;
            for (int i = 0; i + 1 < n; i++) {
                if ((a[i] % 2) == (a[i + 1] % 2)) {
                    ok = false;
                    break;
                }
            }

            sb.append(ok ? "YES" : "NO").append("\n");
        }
        System.out.print(sb);
    }
}
