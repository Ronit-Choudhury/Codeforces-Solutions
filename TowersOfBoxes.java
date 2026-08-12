import java.util.*;
import java.io.*;

public class TowersOfBoxes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int k = d / m + 1; // max boxes per tower
            int towers = (n + k - 1) / k; // ceil(n/k)
            sb.append(towers).append('\n');
        }
        System.out.print(sb);
    }
}
