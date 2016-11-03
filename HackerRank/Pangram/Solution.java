import java.util.*;
import java.lang.*;
import java.io.*;
class Solution
{
	public static void main (String[] args){
	Scanner in=new Scanner(System.in);
	
	String str;
	int i,l;
	boolean b;
	b=true;
	str=in.readLine();
	l=str.length();
	
	if(l>=1 && l<=1000){
		for(char chr='A';chr<='Z';chr++){	
		
			if(str.indexOf(chr)<0 && str.indexOf((char) (chr+32 ))<0){
					b=false;
			}

		}
		if(b==true){
			System.out.println("pangram");
		}else{
			System.out.println("not pangram");
		}
	}
}
}