import java.io.*;
import java.util.*;
public class Main{
    static long ceilDiv(long a,long b){return (a+b-1)/b;}
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine().trim());
        StringBuilder out=new StringBuilder();
        while(T-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            long n=Long.parseLong(st.nextToken());
            long x=Long.parseLong(st.nextToken());
            long y=Long.parseLong(st.nextToken());
            long z=Long.parseLong(st.nextToken());
            long noAI=ceilDiv(n,x+y);
            long maxOnly=ceilDiv(n,x);
            long ai;
            if(maxOnly<=z){
                ai=maxOnly;
            }else{
                long rem=n-z*x;
                ai=z+ceilDiv(rem,x+10*y);
            }
            out.append(Math.min(noAI,ai)).append('
');
        }
        System.out.print(out);
    }
}
