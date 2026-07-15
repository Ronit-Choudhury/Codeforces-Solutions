import java.util.*;

public class Bigrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();

            boolean yes = false;
            int atleastTwo = 0;

            for (int i = 0; i < k; i++) {
                int x = sc.nextInt();

                if (x >= 4)
                    yes = true;

                if (x >= 2)
                    atleastTwo++;
            }

            if (yes || atleastTwo >= 2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}