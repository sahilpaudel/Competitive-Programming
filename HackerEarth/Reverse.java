
import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        int n,p=0;
		int i=0;
        String s[] = new String[30];
		char c[] = null;
        Scanner in = new Scanner(System.in);
		
                 n = in.nextInt();
                 
                 for(i=0; i<n; i++){
                 	
                 	s[i] = in.next();
                 }
                 
                 for(int j=0; j<n; j++){
                 							
				   c = s[j].toCharArray();
				   
				   p = c.length;
				   
				   for(i=p-1; i>=0; i--){
					   
					
					System.out.print(c[i]);
                 	   
                    }
					System.out.print("\n");
                 }
        

       
    }
}
