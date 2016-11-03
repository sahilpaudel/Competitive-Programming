import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
	   int a[] = new int[100];
        int n[]=new int[100];
       BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
       try
       {   
         int T= Integer.parseInt(inp.readLine());
            
         for(int i=0;i<T;i++)
         {
           n[i]= Integer.parseInt(inp.readLine());
              int np=n.length;
				 for(int j=1; j<=n.length; j++){
					 
					 if(np%2==0){
						 
						 a[j] = (np/2)+j;
						 np--;
						 
						 if(j==np){
							 
							 j=1;
						 }
					 }else{
						 
						 a[j] = j;
						 np--;
						 
						 if(j==np){
							 
							 j=1;
						 }
					 }
					 
				 }
			 
         }
       }
         catch(Exception e){}
       for(int i=1;i<=n.length;i++)
        if(a[i]!=n[i]){
		   System.out.println(a[i]);
	   }
    }
}

