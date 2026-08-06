import java.io.*;
import java.util.*;

public class Main {
    static String remove(String s,int idx){
        return s.substring(0,idx)+s.substring(idx+1);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        StringBuilder out=new StringBuilder();
        while(T-->0){
            String s=br.readLine();
            String bestAlice=null;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!='0') continue;
                String afterA=remove(s,i);
                String bestBob=null;
                for(int j=0;j<afterA.length();j++){
                    if(afterA.charAt(j)!='1') continue;
                    String fin=remove(afterA,j);
                    if(bestBob==null||fin.compareTo(bestBob)<0) bestBob=fin;
                }
                if(bestAlice==null||bestBob.compareTo(bestAlice)>0) bestAlice=bestBob;
            }
            out.append(bestAlice).append('\n');
        }
        System.out.print(out);
    }
}
