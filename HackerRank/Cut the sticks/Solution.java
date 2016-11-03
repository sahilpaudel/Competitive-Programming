import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		int k = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i < n; i++){
            arr.add(in.nextInt());
        }
		while(arr.size()!=0){

			int min = Collections.min(arr);
			
			for(int i=0; i < arr.size(); i++){
				arr.set(i,arr.get(i) - min);
			}
			System.out.println(arr.size());
			arr.removeAll(Collections.singleton(0));
			
		}
    }
}





