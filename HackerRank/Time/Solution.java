import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
		
		String d = ":";
		String temp[] = time.split(d);
		temp[2] = time.charAt(time.length()-4)+""+time.charAt(time.length()-3);
        
		
		if(time.charAt(time.length()-2)=='A' && temp[0].equals("12")){
			
			temp[0] = "00";
			System.out.println(temp[0]+":"+temp[1]+":"+temp[2]);
		}
		if(time.charAt(time.length()-2)=='A' && !temp[0].equals("12")){
			
            System.out.println("RUN");
			System.out.println(temp[0]+":"+temp[1]+":"+temp[2]);
		}
		if(time.charAt(time.length()-2)=='P' && !temp[0].equals("12")){
			
			int t=Integer.parseInt(temp[0]);
			t = t+12;
			
			if(t==24){
				t=00;
			}
			
			System.out.println(t+":"+temp[1]+":"+temp[2]);
		}
    }
}
