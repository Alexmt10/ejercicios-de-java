package tema4;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		System.out.println("Es cribe dos números para crear un parametro del 0 al 10000");
		System.out.println("El mas chico");
	    int num1 = sc.nextInt();
	    System.out.println("El mas grande");
	    int num2 = sc.nextInt();
		
	    System.out.println("Introduce un valor que este dentro del rango");
	    int num3 = sc.nextInt();
		
		
	    boolean acierto = false;

      	 
        while (acierto == false){
		   
	   if ((num3>num1)&&(num3<num2)) {
	        System.out.println("Acierto");
	        acierto = true;
	            
	   }
	   else {
	   
	   if(num3<num1) {
       	System.out.println("Es mas grande");
	   }
	   else if (num3>num2) {
		   System.out.println("Es mas pequeño");
	   }
	   System.out.println("Introduce un valor que este dentro del rango");
	   num3 = sc.nextInt();
	   }
        }
		sc.close();
		}
}
	   


