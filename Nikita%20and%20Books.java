import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine().trim());
        StringBuilder out=new StringBuilder();
        while(T-->0){
            int n=Integer.parseInt(br.readLine().trim());
            StringTokenizer st=new StringTokenizer(br.readLine());
            long carry=0;
            boolean ok=true;
            long prev=Long.MIN_VALUE;
            for(int i=0;i<n;i++){
                long a=Long.parseLong(st.nextToken());
                a+=carry;
                if(i==n-1){
                    if(a<=prev) ok=false;
                }else{
                    long need=Math.max(1, prev+1);
                    if(a<need){ ok=false; }
                    else{
                        carry=a-need;
                        prev=need;
                    }
                }
            }
            out.append(ok?"YES":"NO").append('\n');
        }
        System.out.print(out);
    }
}
