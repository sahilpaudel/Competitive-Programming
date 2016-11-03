import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int index(int a[],int n){
        
       
        int index1=0,index2=0;
        int take = 0;
        int out = 0;
        if(n==1)
			return 1;
		else
			for(int i=0;i<n;i++){
              
			   int sum1=0,sum2=0;
				take = i+1;
				index1 = take - 1;
				index2 = take + 1;
				
				while(index1 >= 0){
					sum1 +=a[index1];
					index1--;
				}
				while(index2 < n){
					sum2 +=a[index2];
					index2++;
				}
				
				if(sum1 == sum2){
					out = 1;
					break;
				}
				else
					out = 0;
			}
			return out;
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i<t; i++){
            
            int size_of_array = in.nextInt();
            int a[] = new int[size_of_array];
            for(int k=0; k<size_of_array; k++){
                a[k] = in.nextInt();
            }
            
            int out = index(a,size_of_array);
			if(out==1)
			  System.out.println("YES");
			if(out==0)
			  System.out.println("NO");
        }
    }
}