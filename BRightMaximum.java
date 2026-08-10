import java.util.*;
import java.io.*;

public class BRightMaximum {

    // Sparse table comparator: prefer larger value; on tie, prefer larger index (rightmost).
    private static int better(int[] a, int i, int j) {
        if (a[i] > a[j]) return i;
        if (a[j] > a[i]) return j;
        return Math.max(i, j);
    }

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

            // Precompute log table
            int[] logTable = new int[n + 1];
            for (int i = 2; i <= n; i++) {
                logTable[i] = logTable[i / 2] + 1;
            }

            int LOG = logTable[n] + 1;

            // sparse[k][i] = index of the "best" element (max value, rightmost on tie)
            // in the range [i, i + 2^k - 1]
            int[][] sparse = new int[LOG][n];
            for (int i = 0; i < n; i++) {
                sparse[0][i] = i;
            }
            for (int k = 1; k < LOG; k++) {
                int half = 1 << (k - 1);
                int len = 1 << k;
                for (int i = 0; i + len <= n; i++) {
                    int idx1 = sparse[k - 1][i];
                    int idx2 = sparse[k - 1][i + half];
                    sparse[k][i] = better(a, idx1, idx2);
                }
            }

            int r = n - 1;
            int count = 0;

            while (r >= 0) {
                int len = r + 1;
                int k = logTable[len];
                int idx1 = sparse[k][0];
                int idx2 = sparse[k][len - (1 << k)];
                int best = better(a, idx1, idx2);
                count++;
                r = best - 1;
            }

            sb.append(count).append('\n');
        }

        System.out.print(sb);
    }
}
