import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution
{
		
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int j = 0;
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();
		long a[] = new long[n];
        long b[] = new long[n];
		
		for(int i=0; i<n; i++)
			a[i] = in.nextInt();
		

        for(int i=0; i<n; i++)
        {
            b[(i+k)%n] = a[i];
        }
		
		for(int i=0; i<q; i++)
		{
			int p = in.nextInt();
			
			System.out.println(b[p]);
		}
	}
}