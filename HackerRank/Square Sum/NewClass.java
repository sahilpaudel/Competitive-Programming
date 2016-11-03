import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static int getSquaredSum(int num){
		
		int sum = 0,r=0;
		
		while(num!=0){
			
			r = num%10;
			
			sum += r*r;
			
			num = num/10;
			
		}
	
		return sum;
	}
	
    public static void main(String[] args) {
		
       int count=0,num=0,range=0;
	   
	   int sum=0;
	   
	   boolean a[] = new boolean[10000];
	   
	    Scanner in  =  new Scanner(System.in);
		
		      num = in.nextInt();
			   
			   range = (int)(Math.pow(10,num));
			   
			   
			  
			  
			for(int i=2; i<range; i++){
				
			 sum = getSquaredSum(i);
			 
			 int temp = sum;
			 
			  if(a[temp]){
				  
				  count++;
				  
     		  }else{
				  
			  while(true){
  
				  sum = getSquaredSum(sum); 
	
				  if(a[sum] || sum==89){
					  
					  
	                  a[temp] = true;
					  count++;
                      break;					  
				  
				  }else if(sum==1){
					  
					 break;
					  				  
				  }
				  		  		  
				 
			   }
			  }
			}
			    System.out.println(count%1000000007);             
            			  
    }
}