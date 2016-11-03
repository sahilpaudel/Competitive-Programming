import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
		
		for(int i=0;i<t;i++){
			
			int n = in.nextInt();
			
			StringBuilder sb = new StringBuilder();
						
			for(int s=n;s>0;s--){
				//checking for divisibility by both 3 and 5 at common point.
				if(s%3 == 0 && (n-s)%5 == 0){
					for(int k=0;k<n;k++)
						sb.append("5");
					for(int l=s;l<n;l++)
						sb.append("3");
					break;
				}
				
			}
			//checking for divisibility by 5 as for three is checked above as 3 comes earlier than 5.
			//length is zero becos, until we get five 3's we don't append do its 0.
			if(sb.length() == 0 && n%5==0){
				for(int l=n;l>0;l--)
					sb.append("3");
			}
			else if(sb.length() == 0)
					sb.append("-1");
			
			System.out.println(sb);
		}
    }
}
