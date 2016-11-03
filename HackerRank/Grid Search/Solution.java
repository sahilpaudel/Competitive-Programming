import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		int l = 0;
		int J[] = new int[10];
		int K[] = new int[10];
		int B[] = new int[10];
		
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
			System.out.println("input - G");
            int R = in.nextInt();
            int C = in.nextInt();
			System.out.println("G");
            String G[][] = new String[R][C];
            for(int j=0; j < R; j++)
				for(int k=0; k < C; k++)
					G[j][k] = in.next();
            
			System.out.println("input - P");
            int r = in.nextInt();
            int c = in.nextInt();
			System.out.println("P");
            String P[][] = new String[r][c];
            for(int j=0; j < r; j++)
				for(int k=0; k < c; k++)
					P[j][k] = in.next();
				
			
			for(int j=0; j < R; j++){
				for(int k=0; k < C; k++){
					if((P[0][0]).equals(G[j][k]) || (P[0][1]).equals(G[j][k]) || (P[1][0]).equals(G[j][k]) || (P[1][1]).equals(G[j][k])){
						
						J[l] = j;
						K[l] = k;
						l++;
					}
				}
			}
			
        }
		int o[] = {0,1,1,2};
		for(int j=0; j < l; j++){
			 B[j] = J[j] + K[j] - o[j];
		}

		for(int j=0; j < l; j++){
			if(B[j] = )		
		}
		
		
			
    }
}
