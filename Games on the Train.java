import java.io.*;
import java.util.*;
public class Main{
 public static void main(String[] args)throws Exception{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int T=Integer.parseInt(br.readLine().trim());
  StringBuilder sb=new StringBuilder();
  while(T-->0){
    int n=Integer.parseInt(br.readLine().trim());
    StringTokenizer st=new StringTokenizer(br.readLine());
    int mn=1_000_000,mx=0;
    for(int i=0;i<n;i++){
      int v=Integer.parseInt(st.nextToken());
      mn=Math.min(mn,v);
      mx=Math.max(mx,v);
    }
    sb.append(mx-mn+1).append('\n');
  }
  System.out.print(sb);
 }
}
