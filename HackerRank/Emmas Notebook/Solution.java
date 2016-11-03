import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int bits=0;
		int n=2,sum=0;
        
		for(int i=0; i<t; i++){
			
			for(int j=0; j<n; j++){
				
				bits = in.nextInt();
				
				sum +=bits;
								
				if(n>t+1){
					break;
				}
				
			}
			n++;
			
		}
		
		System.out.println(sum);
    }
}
