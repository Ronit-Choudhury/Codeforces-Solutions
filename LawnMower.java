import java.util.*;
import java.io.*;

public class LawnMower {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long w = Long.parseLong(st.nextToken());
            long kept = n / w; // minimum boards to keep, spaced so no w consecutive removed
            sb.append(n - kept).append('\n');
        }
        System.out.print(sb);
    }
}
