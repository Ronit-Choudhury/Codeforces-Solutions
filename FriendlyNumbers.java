import java.util.*;
import java.io.*;

public class FriendlyNumbers {
    static long digitSum(long y) {
        long s = 0;
        while (y > 0) {
            s += y % 10;
            y /= 10;
        }
        return s;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            long x = Long.parseLong(br.readLine().trim());
            int count = 0;
            // digit sum of y (y up to ~1e9+100) is at most 9*10 = 90,
            // so checking y in [x, x+100] is more than enough.
            for (long y = x; y <= x + 100; y++) {
                if (y - digitSum(y) == x) count++;
            }
            sb.append(count).append('\n');
        }
        System.out.print(sb);
    }
}
