import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
 static long n,mn,k=0,number;
 static long arr[] = new long[100000];
 
 static Scanner in = new Scanner(System.in);
 
 static long getCount(){
 
  			
			       number = in.nextInt();
				   
					mn = number-1;
					
					k=0;
					
			      do{
				     if(mn%3==0 || mn%5==0){
						 
					        k = k+mn;	
					 }
					 
				     mn--;
					 
				  }while(mn!=0);
				  			  
            return k;
 }
    public static void main(String[] args) {
	    
		n = in.nextInt();
		
	    for(int i=0; i<n; i++){	
		
             arr[i] = getCount();
			 
			}
			
		 for(int i=0; i<n; i++){	
		 
             System.out.println(arr[i]);
			 
			}	
		
    }
}