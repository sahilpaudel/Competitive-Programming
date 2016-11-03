import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		int count = 0;
		
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
		
		String res[] = new String[t];
		
        for(int a1 = 0; a1 < t; a1++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int i=0; i < n; i++){
                a[i] = in.nextInt();
            }
			
			for(int i=0; i < n; i++){
                if(a[i] <=0 ){
				   count++;
				}
            }
			
			if(count < k){
				res[a1] = "YES";
			    count = 0;
			}
			else{
				res[a1] = "NO";
			    count = 0;
			}
        }
		
		for(int a1 = 0; a1 < res.length; a1++)
			System.out.println(res[a1]);
    }
}
