import java.util.*;
import java.io.*;

public class Koshary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            boolean ok = !(x % 2 == 1 && y % 2 == 1);
            sb.append(ok ? "YES" : "NO").append('\n');
        }
        System.out.print(sb);
    }
}
