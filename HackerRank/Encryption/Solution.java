import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
       
        char[]  c = s.toCharArray();
        int len = s.length();
        int k =0;
        int row =(int) Math.floor(Math.sqrt(len));
        int col =(int) Math.ceil(Math.sqrt(len));
        int i=0;
		int l = 0;
		
		while(k<col){
			
			for(i = l; i< len; i+=col) {
				System.out.print(c[i]);
			}
			l++;
			    System.out.print(" ");
		k++;
        }
      
            
    }
}
