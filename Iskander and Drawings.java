import java.io.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine().trim());
        StringBuilder out=new StringBuilder();
        while(T-->0){
            int n=Integer.parseInt(br.readLine().trim());
            String s=br.readLine().trim();
            int best=0,cur=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='#') cur++;
                else{
                    if(cur>0) best=Math.max(best,(cur+1)/2);
                    cur=0;
                }
            }
            if(cur>0) best=Math.max(best,(cur+1)/2);
            out.append(best).append('\n');
        }
        System.out.print(out);
    }
}
