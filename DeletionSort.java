import java.util.*;
import java.io.*;

public class DeletionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

            boolean sorted = true;
            for (int i = 0; i + 1 < n; i++) {
                if (a[i] > a[i + 1]) {
                    sorted = false;
                    break;
                }
            }

            // If already non-decreasing, no moves are allowed, so all n remain.
            // Otherwise, it's always possible to strip down to a single element
            // without accidentally hitting a sorted state early (since with
            // length >= 3 and a descent present, some element other than the
            // descent pair can always be removed while keeping it unsorted).
            sb.append(sorted ? n : 1).append('\n');
        }
        System.out.print(sb);
    }
}
