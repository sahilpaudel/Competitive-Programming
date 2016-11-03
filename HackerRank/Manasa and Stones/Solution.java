import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	static int max(int a, int b){
		
		return a > b ? a:b;
	}
	static int min(int a, int b){
		
		return a < b ? a:b;
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int i = 0; i < t; i++) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            
            int start = (n-1)*min(a,b);
            int end   = (n-1)*max(a,b);
			if(start==end)
				System.out.print(start);
			else
            for(int k = start; k <= end; k += (max(a,b)-min(a,b))) {
               System.out.print(k+" ");
            }
             System.out.println();
        }
    }
}