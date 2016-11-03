import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        String res = "";
        Scanner in = new Scanner(System.in);
            int t  = in.nextInt();
			
        for(int i=0;i<t;i++){
            
            String s = in.next();
            int n = s.length();
            char c[] = s.toCharArray();
            StringBuilder sb= new StringBuilder();
            sb.append(s);
            sb = sb.reverse();
            String st = new String(sb);
            char ch[] = st.toCharArray();
            //System.out.println("Real : "+s);
            //System.out.println("Reverse : "+st);
            for(int k=1;k<n;k++){
				
			    int rev = Math.abs((int)ch[k] - (int)ch[k-1]);
				int act = Math.abs((int)c[k] - (int)c[k-1]);
                //System.out.println(rev +" "+act);
				if(rev != act){
					res = "Not Funny";
					break;
				}else{
					res = "Funny";
				}
					           
            }
            System.out.println(res);
        }
		
		
    }
}