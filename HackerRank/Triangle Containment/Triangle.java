import java.util.Scanner;
import java.math.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Triangle{
      
	  int number;
	  int cord[] = new int[6];
	  
	  Scanner in = new Scanner(System.in);
	  
	  
	  double area(double x1, double y1, double x2, double y2, double x3, double y3){
	  
	       return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
	  
	  }
	  
	  boolean hasOrigin(int x1, int y1, int x2, int y2, int x3, int y3,int x,int y){
	  
	             
                 double a = area (x1, y1, x2, y2, x3, y3);
 
                 
                 double b = area (x, y, x2, y2, x3, y3);
 
                  
                  double c = area (x1, y1, x, y, x3, y3);
 
                 
                  double d = area (x1, y1, x2, y2, x, y);
   
                 
                  return (a == b + c + d);
	  
	  }
	  
       int input() throws Exception{
	         int kp=0;
			 int count=0;
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	              
	   
	              //   System.out.println("Enter the number of triangles\n");
			            number = in.nextInt();
			
			         // StringTokenizer st = new StringTokenizer(br.readLine());
			     
				  for(int i=0; i< number; i++){
				  
			        //System.out.println("Enter the Co-ordinates of  triangle "+i+"\n");
					
					 
					   StringTokenizer st = new StringTokenizer(br.readLine());
					   for(int k=0; k<6; k++){
					       
						   cord[k] = Integer.parseInt(st.nextToken());
					   }
					   
					   
					  if(hasOrigin(cord[0],cord[1],cord[2],cord[3],cord[4],cord[5],0,0)){
					  
					        kp = 1;
							
							count++;
					  }else{
					        kp = 0;
					  }
					  
				  }
				  
				  return count;
	   }
   

      public static void main(String[] args){
	        Triangle t = new Triangle();
			int k;
			  try{
			        k = t.input();
					System.out.println(k);
			 }catch(Exception e){
			 
			   e.printStackTrace();
			 }
	  }
}