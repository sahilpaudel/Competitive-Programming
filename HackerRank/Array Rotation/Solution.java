import java.io.*;
import java.util.*;

public class Solution {
    
    int stack[] = new int[1000000];
    int top = -1;
    
    void push(int n){
        top = top + 1;
        stack[top] = n;
    }
    
    void show(){
       
        for(int i=0; i <=top; i++){
            System.out.print(stack[i]+" ");
        }
    }
    
    public static void main(String[] args) {
       int k=0;
       Solution s = new Solution();
       Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int d = in.nextInt();
            int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        k=d;//index from where to rotate
        for(int i=k; i < n; i++){
            s.push(arr[i]);
			//System.out.println(arr[i]+" IS PUSHED");
        }
        
        for(int i=0; i < k; i++){
            s.push(arr[i]);
			//System.out.println(arr[i]+" IS PUSHED");
        }
        
        s.show();
    }
}