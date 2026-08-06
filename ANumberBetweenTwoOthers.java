import java.util.*;
import java.io.*;

public class ANumberBetweenTwoOthers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());

            long k = y / x;
            sb.append(k == 2 ? "NO" : "YES").append('\n');
        }

        System.out.print(sb);
    }
}
