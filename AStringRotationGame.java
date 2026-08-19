import java.util.*;
import java.io.*;

public class AStringRotationGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();

            int blocks = 1;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    blocks++;
                }
            }

            if (blocks > 1 && s.charAt(0) == s.charAt(n - 1)) {
                blocks--;
            }

            sb.append(blocks).append("\n");
        }
        System.out.print(sb);
    }
}
