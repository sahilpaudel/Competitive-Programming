import java.util.*;
public class Solution {
	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    int i = a.size()-1;
		int sum = a.get(i) + 1;
		
		while(sum > 9 && i > 0){
			int r = sum % 10;
			a.set(i,r);
			i--;
			sum = a.get(i) + 1;
			
		}
		a.set(i,sum);
		if(a.get(0) > 9){
			
			a.set(0,a.get(0)%10);
			
			for(int j=0; j<i; i++){
				a.set(j,a.get(i));
			}
			a.add(0,1);
		}
		while(a.get(0)==0)
			a.remove(0);
		
		return a;
	}
	
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
	    int n;
	    ArrayList<Integer> arr = new ArrayList<>();
	    n = in.nextInt();
	    for(int i = 0; i < n; i++){
	        int num = in.nextInt();
	        arr.add(num);
	    }
	    
	    System.out.print(plusOne(arr));
	}
}
