import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int len = in.nextInt();
        String s = in.next();
		int k = in.nextInt();
		char ch = '.';
        char c[] = s.toCharArray();
		int a[] = new int[len];
		
		for(int i=0; i<len; i++)
			a[i] = (int)c[i];
		
		for(int i=0; i<len; i++){
		  
		  if((a[i]>=65 && a[i]<=90) || (a[i]>=97 && a[i]<=122)){
			  
			  if((a[i]>=65 && a[i]<=90))
				  ch = 'A';
			  else
				  ch = 'a';
			  
			  a[i]=ch+(a[i]-ch+k)%26;  
		 }
        		 
		}
		for(int i=0; i<len; i++){
			
			System.out.print((char)a[i]);
		}
		
    }
}