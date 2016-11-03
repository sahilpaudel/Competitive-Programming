import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
			
			int no_of_choco = n/c;
			int no_of_wrappers = no_of_choco;
			
			while(no_of_wrappers >= m){
				
				int extra_choco = no_of_wrappers/m;
				no_of_choco = no_of_choco + extra_choco;
				int extra_wrappers = extra_choco + (no_of_wrappers%m);
				no_of_wrappers = extra_wrappers;
			}
			System.out.println(no_of_choco);
        }
    }
}
