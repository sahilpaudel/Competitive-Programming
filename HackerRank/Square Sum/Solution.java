import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
	static int[] toArray(int num){
		
		int r=0,q=0,i=0;
		int a[] = new int[100];
		
		while((num/10)!=num){
			
			r = num%10;
			num = num/10;
			
			a[i] = r;
			i++;
		}
		
		return a;
		
	}
	
	static int getSquaredSum(int a[]){
		
		int sum = 0;
		
		for(int i=0; i<5; i++){
					  
			sum += (int)Math.pow(a[i],2);
					 
		}
		
		return sum;
	}
	
    public static void main(String[] args) {
		
       int count=0,num=0,range=0,temp=0;
	   
	   int sum=0;
	   
	   int piece[] = new int[100];
	   
	  
	    Scanner in  =  new Scanner(System.in);
		
		      num = in.nextInt();
			   
			   range = (int)(Math.pow(10,num));
			   
			   range = range-1;
			   
			   temp = range; 
				  
			  while(range!=0){
  
				  piece = toArray(temp);
				  sum = getSquaredSum(piece); 
	
				  if(sum==89){
					  
					  count++;	 
					  --range;
					  temp = range;
					  sum=0;
				  
				  }else if(sum==1){
					  
					  --range;
					  temp = range;
					  sum = 0;
					  				  
				  }else{
					  
					  temp = sum;
					  sum=0;
				  }
				  		  		  
				 
			  }
			    System.out.println(count%1000000007);             
            			  
    }
}