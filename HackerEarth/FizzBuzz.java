import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {

         int n=0,t=0;
         Scanner in = new Scanner(System.in);
         t = in.nextInt();
         
         for(int i=0; i<t; i++){
         	
         	n = in.nextInt();
         	
          for(int j=1; j<=n; j++){	
		  
         	if(j%3==0 && j%5==0){
				
				System.out.println("FizzBuzz");
			}else{
				
				if(j%5==0)
         	    System.out.println("Buzz");
                else if(j%3==0)
         	    System.out.println("Fizz");
         	    else 
         	    System.out.println(j);
			}
         	    
            
          }
          
         }
        
    }
}
