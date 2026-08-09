import java.util.*;
import java.io.*;

public class SimonsAndCakesForSuccess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            long temp = n;
            long k = 1;
            for (long p = 2; p * p <= temp; p++) {
                if (temp % p == 0) {
                    k *= p;
                    while (temp % p == 0) temp /= p;
                }
            }
            if (temp > 1) k *= temp;
            sb.append(k).append('\n');
        }
        System.out.print(sb);
    }
}
