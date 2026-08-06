import java.util.*;
import java.io.*;

public class SlimesOnALine {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(st.nextToken());
                min = Math.min(min, val);
                max = Math.max(max, val);
            }

            int diff = max - min;
            int answer = (diff + 1) / 2; // ceil(diff / 2)

            sb.append(answer).append('\n');
        }

        System.out.print(sb);
    }
}
