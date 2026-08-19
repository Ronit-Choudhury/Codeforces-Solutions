import java.util.*;
import java.io.*;

public class ATableWithNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());

            int lo = Math.min(h, l);
            int hi = Math.max(h, l);

            st = new StringTokenizer(br.readLine());
            int A = 0; // elements usable in either role (<= lo)
            int B = 0; // elements usable only in the "loose" role (lo < a <= hi)
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(st.nextToken());
                if (a <= lo) {
                    A++;
                } else if (a <= hi) {
                    B++;
                }
            }

            int answer = Math.min(A, (A + B) / 2);
            sb.append(answer).append("\n");
        }
        System.out.print(sb);
    }
}
