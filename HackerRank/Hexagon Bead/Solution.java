import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution
{
		
	public static void main(String[] args){
		
			
			long a =115985550103503;
			long bead = 6;
			long minus = 3;
			long sum = bead;
			int i = 1;
			
			while(sum!=a){
				
				bead += 6;
				sum = sum + bead - minus;
				minus += 2;
				i++;
			}
			System.out.println(i);
	}
}