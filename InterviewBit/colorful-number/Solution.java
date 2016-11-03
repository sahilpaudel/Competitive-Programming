import java.util.*;
public class Solution {
    
    static int getProduct(int digits) {
		if(digits < 10) return digits;
		int num = digits;
		int product = 1;
		while(num > 0){
			product = product * (num % 10);
			num = num / 10;
		}
		return product;
	}
    
	static public int colorful(int number) {
	    
	    if(number < 10) return 1;
		
		String colorString = String.valueOf(number);
		int length = colorString.length();
		
		List<Integer> colorMap = new ArrayList<Integer>();
		
		for(int i =  0; i < length; i++){
			for (int j = 0;  j < length; j++){
				
				if((i+j+1) > length) break;
				String sub = colorString.substring(i, j+i+1);
				//System.out.println("["+sub+"]");
				int product = getProduct(Integer.parseInt(sub));
				//System.out.println(product);
				if(colorMap.contains(product)) return 0;
				else{
					colorMap.add(product);
				}
				
			}
		}
		//System.out.println(colorMap);
		
		return 1;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(colorful(n));
	}
	
}
