import java.util.*;
import java.io.*;

public class Snowfall {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());

            // Buckets by (divisible by 2?, divisible by 3?)
            List<Integer> type6 = new ArrayList<>(); // divisible by both 2 and 3
            List<Integer> type2 = new ArrayList<>(); // divisible by 2 only
            List<Integer> type3 = new ArrayList<>(); // divisible by 3 only
            List<Integer> type1 = new ArrayList<>(); // divisible by neither

            for (int i = 0; i < n; i++) {
                int v = Integer.parseInt(st.nextToken());
                boolean by2 = (v % 2 == 0);
                boolean by3 = (v % 3 == 0);
                if (by2 && by3) type6.add(v);
                else if (by2) type2.add(v);
                else if (by3) type3.add(v);
                else type1.add(v);
            }

            // Optimal order: [type6] [type2] [type1] [type3]
            // - type6 elements clustered at one end minimizes subarrays
            //   automatically divisible by 6.
            // - type2 and type3 kept as separate contiguous blocks (not
            //   interleaved), with type1 elements placed strictly between
            //   them, minimizes subarrays divisible by 6 coming from a
            //   combination of a "2" element and a "3" element.
            for (int v : type6) sb.append(v).append(' ');
            for (int v : type2) sb.append(v).append(' ');
            for (int v : type1) sb.append(v).append(' ');
            for (int v : type3) sb.append(v).append(' ');
            sb.append('\n');
        }

        System.out.print(sb);
    }
}
