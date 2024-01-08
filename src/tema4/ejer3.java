package tema4;

import java.util.Scanner;

public class ejer3 {

	 public static void main(String[] args) {
	        var sc = new Scanner(System.in);
	        
	        int numrandom = (int) (Math.random()*100);
	        
	        System.out.println("Introduce un número");
       	    int num1 = sc.nextInt();
       	 boolean acierto = false;

       	 
         while (acierto == false){
	        	
	       if (numrandom== num1) {
	    	   System.out.println("Acierto");
	    	   
	    	   acierto=true;
	       }
	       else { 
	       
	        if(num1<numrandom) {
	        	System.out.println("Es mas grande");
	        }
	        else {
	        	System.out.println("Es mas pequeño");
	        }
	        System.out.println("Introduce un número");
       	    num1 = sc.nextInt();
	       }
	        }
	        sc.close();
	       
	
	 
	        }
	 }

