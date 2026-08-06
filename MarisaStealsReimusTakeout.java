import java.util.*;
import java.io.*;

public class MarisaStealsReimusTakeout {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int c0 = 0, c1 = 0, c2 = 0;
            for (int i = 0; i < n; i++) {
                int v = Integer.parseInt(st.nextToken());
                if (v == 0) c0++;
                else if (v == 1) c1++;
                else c2++;
            }

            int pairs = Math.min(c1, c2);
            int leftover = Math.abs(c1 - c2);
            int triples = leftover / 3;

            int answer = c0 + pairs + triples;

            sb.append(answer).append('\n');
        }

        System.out.print(sb);
    }
}
