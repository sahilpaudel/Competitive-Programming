import java.util.Scanner;
import java.math.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Solution{
      
	  int number;
	  int cord[] = new int[6];
	  StringTokenizer f;
	  
	  float area(int x1, int y1, int x2, int y2, int x3, int y3){
	  
	       return (float) Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
	  
	  }
	  
	  boolean hasOrigin(int x1, int y1, int x2, int y2, int x3, int y3,int x,int y){
	  
	             
                 float a = area (x1, y1, x2, y2, x3, y3);
 
                 
                 float b = area (x, y, x2, y2, x3, y3);
 
                  
                  float c = area (x1, y1, x, y, x3, y3);
 
                 
                  float d = area (x1, y1, x2, y2, x, y);
   
                 
                  return (a == b + c + d);
	  
	  }
	  
       int input() throws Exception{
	         int kp=0;
			 int count=0;
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	              StringTokenizer v = new StringTokenizer(br.readLine());
	   
	             
			            number = Integer.parseInt(v.nextToken());
			            
						if(number<=0 || number>=Math.pow(10,5)){return 0;}
			        
			     
				  for(int i=0; i< number; i++){
				  
			     
					
					 
					   StringTokenizer st = new StringTokenizer(br.readLine());
					   for(int k=0; k<6; k++){
					       
						   
						   cord[k] = Integer.parseInt(st.nextToken());
					   }
					   
					   
					  if(hasOrigin(cord[0],cord[1],cord[2],cord[3],cord[4],cord[5],0,0)){
					  
					       if(cord[0] >=Math.pow(-10,6) || cord[2] >= Math.pow(-10,6) || cord[4] >=Math.pow(-10,6)){
						   
						         return 0;
						    }
							
							count++;
							
					  }else{
					        kp = 0;
					  }
					  
				  }
				  
				  return count;
	   }
   

      public static void main(String[] args){
	        Solution t = new Solution();
			int k;
			  try{
			        k = t.input();
					System.out.println(k);
			 }catch(Exception e){
			 
			   e.printStackTrace();
			 }
	  }
}