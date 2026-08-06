import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine().trim());
        StringBuilder out=new StringBuilder();
        while(T-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            long n=Long.parseLong(st.nextToken());
            long a=Long.parseLong(st.nextToken());
            long b=Long.parseLong(st.nextToken());
            long ans=n*a;
            long full=n/3, rem=n%3;
            for(long extra=0;extra<=2;extra++){
                long groups=full+extra;
                if(groups*3<n) continue;
                long covered=Math.min(n,groups*3);
                long indiv=n-groups*3;
                if(indiv<0) indiv=0;
                long cost=groups*b+indiv*a;
                ans=Math.min(ans,cost);
            }
            ans=Math.min(ans,full*b+rem*a);
            out.append(ans).append('
');
        }
        System.out.print(out);
    }
}
