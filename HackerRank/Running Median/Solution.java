import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    
    static double getRunMedian(ArrayList<Double> v){
		
    int n = v.size();
    if(n==0)
        return 0;
    if(n==1)
        return v.get(0);
    else if(n%2==0){
        
        return (v.get(n/2)+v.get((n/2)-1))/2;
    }else if(n%2!=0){
        
        return (v.get(n/2));
    }
    return 0;
    }

    
    
    public static void main(String args[] ) throws Exception     {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Double> v = new ArrayList<>();
        for(int i = 0; i < n; i++){
            v.add(in.nextDouble());
            Collections.sort(v);
            System.out.println(getRunMedian(v));
        }
    }
}
