import java.util.*;
import java.io.*;

public class APassingTheBall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            boolean[] visited = new boolean[n + 1];
            int cur = 1;
            visited[cur] = true;
            for (int i = 0; i < n; i++) {
                if (s.charAt(cur - 1) == 'L') {
                    cur = cur - 1;
                } else {
                    cur = cur + 1;
                }
                visited[cur] = true;
            }
            int count = 0;
            for (int i = 1; i <= n; i++) if (visited[i]) count++;
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}
