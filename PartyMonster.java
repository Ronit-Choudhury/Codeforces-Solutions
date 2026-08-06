import java.util.*;
import java.io.*;

public class PartyMonster {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();

            int open = 0, close = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '(') open++;
                else close++;
            }

            sb.append(open == close ? "YES" : "NO").append('\n');
        }

        System.out.print(sb);
    }
}
