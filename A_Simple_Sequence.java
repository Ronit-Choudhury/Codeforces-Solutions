import java.io.*;
import java.util.*;

public class ASimpleSequence {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            // A simple valid construction:
            // n, n-1, ..., 1
            // For consecutive terms x > y, x % y < y,
            // while y % z <= z-1. The sequence is valid.
            for (int i = n; i >= 1; i--) {
                out.append(i);
                if (i > 1) out.append(' ');
            }
            out.append('\n');
        }

        System.out.print(out);
    }
}
