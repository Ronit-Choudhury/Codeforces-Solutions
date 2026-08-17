import java.util.*;
import java.io.*;

public class ReverseAPermutation {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(System.in, 1 << 16));
        int t = nextInt(in);
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = nextInt(in);
            int[] p = new int[n + 1];
            int[] pos = new int[n + 1]; // pos[value] = index
            for (int i = 1; i <= n; i++) {
                p[i] = nextInt(in);
                pos[p[i]] = i;
            }

            // Find smallest k such that p[k] != (n - k + 1)
            int k = -1;
            for (int i = 1; i <= n; i++) {
                if (p[i] != n - i + 1) {
                    k = i;
                    break;
                }
            }

            if (k != -1) {
                int target = n - k + 1;
                int m = pos[target];
                // reverse p[k..m]
                int l = k, r = m;
                while (l < r) {
                    int tmp = p[l];
                    p[l] = p[r];
                    p[r] = tmp;
                    l++;
                    r--;
                }
            }
            // else: array already fully descending n,n-1,...,1 -> no-op

            for (int i = 1; i <= n; i++) {
                sb.append(p[i]);
                sb.append(i == n ? '\n' : ' ');
            }
        }
        System.out.print(sb);
    }

    private static int nextInt(DataInputStream in) throws IOException {
        int ret = 0;
        int b = in.read();
        while (b < '0' || b > '9') {
            if (b == '-') break;
            b = in.read();
        }
        boolean neg = false;
        if (b == '-') {
            neg = true;
            b = in.read();
        }
        while (b >= '0' && b <= '9') {
            ret = ret * 10 + (b - '0');
            b = in.read();
        }
        return neg ? -ret : ret;
    }
}
