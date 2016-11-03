import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int countGuard(int n, int a[]){
		int s=0;
		for(int i=0; i < n-1; i++){
			
				int j=i+1;
				
					
				  if(a[i]+a[j]>=1){
					
				  }
				  else{
					
				   if(i!=0){	
					 if(a[i-1]==0){
						
						s++;
					 }
				   }
				   else{
				        s++;
			       }
					if(j!=n-1){
						if(a[j+1]==0){
							
							s++;
							a[j]=1;
						}
					}else{
						
						s++;
					}
				 }
			  
				
		}
		return s;
		
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
		//int s=0;
		int n=0;
		int a[]={0,0};
		int s[] = new int[t];
        for(int a0 = 0; a0 < t; a0++){
			
            n = in.nextInt();
			
            a = new int[n];					
            
        
		
		   for(int i=0; i < n; i++){
				
                a[i] = in.nextInt();
		        
		   }
		   
	      s[a0] = countGuard(n,a);
         }
		
		 for(int a0 = 0; a0 < t; a0++)
		 System.out.println(s[a0]);
    }
}
