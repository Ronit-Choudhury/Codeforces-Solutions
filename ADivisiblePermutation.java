import java.util.*;
import java.io.*;

public class ADivisiblePermutation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            // Build the answer reversed: start with 1, then alternately take
            // the current largest and current smallest remaining number.
            List<Integer> b = new ArrayList<>();
            b.add(1);
            int low = 2, high = n;
            boolean takeHigh = true;
            while (low <= high) {
                if (takeHigh) {
                    b.add(high);
                    high--;
                } else {
                    b.add(low);
                    low++;
                }
                takeHigh = !takeHigh;
            }

            // Reverse to get the final permutation.
            for (int i = b.size() - 1; i >= 0; i--) {
                sb.append(b.get(i));
                if (i > 0) sb.append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
