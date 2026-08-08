import java.util.*;
import java.io.*;

public class Blocked {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer[] a = new Integer[n];
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                set.add(a[i]);
            }
            if (set.size() < n) {
                sb.append(-1).append('\n');
            } else {
                Arrays.sort(a, Collections.reverseOrder());
                for (int i = 0; i < n; i++) {
                    sb.append(a[i]);
                    if (i != n - 1) sb.append(' ');
                }
                sb.append('\n');
            }
        }
        System.out.print(sb);
    }
}
