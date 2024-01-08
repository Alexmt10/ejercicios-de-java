package tema4;

import java.util.Scanner;

public class ejer9 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		int alturamasalta = 0;
		int arbolmasalto = 0;
		int numarboles =0;		
		
		System.out.println("Escribe la altura del arbol en centimetros(-1 para terminar)");
		int altura = sc.nextInt();
		
		while (altura!= -1) {
			
			if (altura==-1) {
			
		    }
			if (altura > alturamasalta) {
                alturamasalta = altura;
                arbolmasalto= numarboles;
            }

            numarboles++;
		
            System.out.println("Escribe la altura del arbol en centimetros(-1 para terminar)");
    		 altura = sc.nextInt();
		}
		
		 if (arbolmasalto >= 0) {
	            System.out.println("El árbol más alto es el árbol " + arbolmasalto + " con una altura de " + alturamasalta + " centímetros.");
	        } else {
	            System.out.println("No se ingresaron alturas válidas.");
	        }
	
		
	   sc.close();
		
		}

}
