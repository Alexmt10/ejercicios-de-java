package tema4;

import java.util.Scanner;

public class ejer15 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número : ");
        int num1 = sc.nextInt();
        
        int primo =0;
       
        boolean acierto = true;
               
        for(int i = 1 ;i <= num1 ; i++) {
        
          acierto = true;
        	        	
        	for(int j = 2 ; j < i; j++) {
        			
            if(i % j == 0) {
        				
        		acierto =false;
        			}	
        				
        					
        			}
            if(acierto) {
        				
        		primo++;
        		}
        		
             }
        		
        		
        	
            System.out.println("hay "+ primo + " números primos");
        
      sc.close();  
	}
}