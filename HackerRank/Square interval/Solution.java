import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=0,y=0;
        long a=0,b=0;
            t = in.nextInt();
        for(int i=0; i<t; i++){
            a = in.nextInt();
            b = in.nextInt();
            
            double k = Math.floor(Math.sqrt(b))-Math.ceil(Math.sqrt(a)) + 1;
			
			System.out.println(""+(int)k);
            
        }
       
    }
}