import java.util.*;
import java.io.*;

public class ADBMBAndTheArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Integer.parseInt(st.nextToken());
            }
            int diff = s - sum;
            if (diff >= 0 && diff % x == 0) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }
}
