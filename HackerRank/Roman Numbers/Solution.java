import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
		String s[] = new String[1000];
		StringBuilder sb = null;
		int count = 0,n=0;
                 Scanner in = new Scanner(System.in);
				 
				 n = in.nextInt();
				 for(int i = 0; i<n; i++){
					 
					 s[i] = in.nextLine();
					for(int j = 0; j<s[i].length(); j++){ 
					
					 if(s[i].charAt(i)=='I'){
						 count++;
					 }
					}
					sb.replace(0,s[i].length(),s[i]);
					switch(count){
						
						case 5:
						      sb.insert(i,5);
							  sb.delete(i+1,4);
							  break;
					     default:
						      break;
					}
				 }
				 System.out.println(sb);
				 
				 
            			  
    }
}