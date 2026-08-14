import java.util.*;
import java.io.*;

public class EatingGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            int total = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                total += a[i];
            }

            Set<Integer> winners = new HashSet<>();
            for (int s = 0; s < n; s++) {
                int[] rem = a.clone();
                int remaining = total;
                int pointer = s;
                int last = -1;
                while (remaining > 0) {
                    if (rem[pointer] > 0) {
                        rem[pointer]--;
                        remaining--;
                        last = pointer;
                    }
                    pointer = (pointer + 1) % n;
                }
                winners.add(last);
            }

            sb.append(winners.size()).append('\n');
        }
        System.out.print(sb);
    }
}
