import java.util.*;
import java.io.*;

public class SieveOfErato67henes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean has67 = false;
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                if (x == 67) has67 = true;
            }
            sb.append(has67 ? "YES" : "NO").append('\n');
        }
        System.out.print(sb);
    }
}
