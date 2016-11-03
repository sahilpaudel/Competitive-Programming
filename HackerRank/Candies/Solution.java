import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> rating = new ArrayList<>();		
        	
        int[] total = new int[n];
       		
        for(int i = 0; i < n; i++){
            total[i] = 0;            
        }
        
        total[0] = 1;
        int max = 1;
		int j = 0;
        for(int i = 0; i < n; i++){
            rating.add(in.nextInt());            
        }
           
        for(int i = 1; i < n; i++){
            j=i;
		    if(rating.get(i) == rating.get(i-1))
                total[i] = 1;
			
            if(rating.get(i) > rating.get(i-1) )
			{
				//if(total[i-1]==0) total[i-1] = 1;
                
                total[i] = total[i-1] + 1;
            }
			else
			{
					total[i] = 1;				
            }
			
			while(total[j] == total[j-1] && j!=0){
				total[j-1] = total[j-1] + 1;
				j--;
			}
			
        }
		
		
        
        int sum = 0;
        for(int i = 0; i < n; i++){
                
           sum += total[i];
		   //System.out.println(total[i]);
		   
        }
        System.out.println(sum);
    }
}