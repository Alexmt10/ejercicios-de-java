package tema4;

import java.util.Scanner;

public class ejer2 {
	 public static void main(String[] args) {
	        var sc = new Scanner(System.in);

	      int sumaedad = 0;
	      int mediaedad = 0;
	      int mayoredad = 0;
	      int contadordealumnos = 0;
	       
	      System.out.println("Introduce una edad (negativa para que termine)");
    	  int edad = sc.nextInt();
	     
	      
	      while (edad >= 0) {
	  
	    	  if (edad<0) {
	    		  System.out.println("Error");
	    	
	    	  }
	    	  
	    	  sumaedad = sumaedad + edad;
	           contadordealumnos++;
	           
	           if (edad>18) {
	        	   mayoredad++;
	           }
	           System.out.println("Introduce una edad (negativa para que termine)");
	     	  edad = sc.nextInt();
	      }
	    sc.close();
	    
	    System.out.println("Suma de las edades "+ sumaedad);
	      mediaedad = sumaedad/contadordealumnos;   
	    System.out.println("Media de edad "+ mediaedad);
	    System.out.println("Personas con mayoria de edad " + mayoredad);    	   
	    System.out.println("Hemos introducido la edad de "+ contadordealumnos);   
    
	      }
}    	 	      
	        	
	        	