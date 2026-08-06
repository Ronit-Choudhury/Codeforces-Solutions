import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine().trim());
        StringBuilder out=new StringBuilder();
        while(T-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            String s=br.readLine().trim();
            boolean ok=true;
            for(int r=0;r<k && ok;r++){
                int ones=0;
                for(int i=r;i<n;i+=k){
                    if(s.charAt(i)=='1') ones++;
                }
                if((ones&1)==1) ok=false;
            }
            out.append(ok?"YES":"NO").append('\n');
        }
        System.out.print(out);
    }
}
