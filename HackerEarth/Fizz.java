import java.util.Scanner;

class Fizz{

   static void printf(String s){
	   
	   System.out.println(s);
   }
   
   public static void main(String abc[]){
   
   Scanner in = new Scanner(System.in);
   
    int kases;
    kases = in.nextInt();
    while(kases--!=0) {
        int N;
        N = in.nextInt();

        for(int i = 1; i <= N; ++i) {
        
            if(i % 3 == 0 && i % 5 == 0) printf("FizzBuzz");
            else if(i % 3 == 0) printf("Fizz");
            else if(i % 5 == 0) printf("Buzz");
            else printf(""+i);
        }
    }

   }
}