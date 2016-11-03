import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        char Odd[] = new char[5000];
        char Even[] = new char[5000];
        int j=0,k=0,m=0;
        while(t-->=0){
            
            String s = in.nextLine();
            for(int i=0; i<s.length(); i++){
                if(i%2==0){
                    Even[j] = s.charAt(i);
                    j++;
                }
                else{
                    Odd[k]  = s.charAt(i);
                    k++;
                }
            }
            
            for(int i=0; i<j; i++){
                System.out.print(Even[i]);
            }
                System.out.print(" ");
            
            for(j=0; j<k; j++){
                System.out.print(Odd[j]);
            }
           System.out.println();
		   j=0; k=0;
        }
    }
}