import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int p = in.nextInt();
       int q = in.nextInt();
        int n = p*p;
		String s = String.valueOf(n);
		int [] arr = new int[10000];
		int [] a = new int[10000];
			int i = 0;
			while ( n != 0) {
				arr[i] = n%10;
				n /= 10;
				i++;
			}
			int h = s.length();
			for(int k=0; k<s.length(); k++) {
				a[k] = arr[h];
				--h;
			}
			
			for(int k=0; k<s.length(); k++) 
				System.out.print(a[k]);
			 
    }
}