import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int A[] = new int[N];
		int r=0,ob=0,ac=0;
        for(int i=0; i < N; i++){
            A[i] = in.nextInt();
				
        }
		
		for(int i=0; i < N - 2; i++){
           for(int j=i+1; j < N - 1; j++){           
			    for(int k=j+1; k < N; k++){
				   
				   int a = A[i];
				   int b = A[j];
				   int c = A[k];
				   
				  if((a+b)>c && (a+c)>b && (c+b)>a){
					  
					  if((a*a)+(b*b)<(c*c) || (a*a)+(c*c)<(b*b) || (b*b)+(c*c)<(a*a)){
						  
						  ob++;
					   }
					  
					  
					   else if((a*a)+(b*b)==(c*c) || (a*a)+(c*c)==(b*b) || (b*b)+(c*c)==(a*a)){
						  
						    r++;
					   }
					   else if((a*a)+(b*b)>(c*c) || (a*a)+(c*c)>(b*b) || (b*b)+(c*c)>(a*a)){
						  
						ac++;
					   }
				  }
			   }
				
            }
				
        }
		
		System.out.print(ac+" ");
		System.out.print(r+" ");
		System.out.print(ob+" ");
		
		
		 
    }
}
