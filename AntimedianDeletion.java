import java.util.*;
import java.io.*;

public class AntimedianDeletion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            br.readLine(); // consume the array line, values not needed
            int ans = Math.min(n, 2);
            for (int i = 0; i < n; i++) {
                sb.append(ans);
                if (i != n - 1) sb.append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
