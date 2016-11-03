import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     int i=0;
	 int[] getD(int n){
		 
	   //getting length of number
	   String str = ""+n;
	   int a[] = new int[str.length()];
	    while(n>0){
			
			a[i++] = n%10;
			n = n/10;
		}
		return a;
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
		int count = 0;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
			
		int a[] = (new Solution()).getD(n);
		for(int i = 0; i < Integer.toString(n).length(); i++){
           
		   if(a[i] == 0){} 
		   else{
			   if(n%a[i] == 0){
				   count++;
			   }
		   }
		   
        }
		System.out.println(count);
		count = 0;
        }
		
        
    }
}
