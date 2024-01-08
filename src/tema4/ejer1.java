package tema4;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Introduce un número (0 para salir):");

        int num1 = sc.nextInt();

        int num2 = 0;

        while (num1 != num2) {

          if (num1 == 0) {
           
        	  System.out.println("Terminar");

          }



          if (num1 % 2 == 0) {



              System.out.println(num1 + " es múltiplo de 2.");



          } else {



              System.out.println(num1 + " no es múltiplo de 2.");



          }







          if (num1 > 0) {



              System.out.println(num1 + " es positivo.");



          } else if (num1 < 0) {



              System.out.println(num1 + " es un número negativo.");



          } else {



              System.out.println(num1 + " es cero.");



          }







          int cuadrado = num1 * num1;



          System.out.println("El cuadrado de " + num1 + " es " + cuadrado);



          System.out.println("Introduce un número (01 para salir):");

          num1 = sc.nextInt();

        

        }



      sc.close();

        

  }



}


	
	
	
	
	
	
	



	
