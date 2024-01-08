package tema4;

import java.util.Scanner;

public class ejer13 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		
		int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Ingrese la calificación del alumno " + i + ": ");
            int calificacion = sc.nextInt();

            if (calificacion >= 5) {
                aprobados++;
            } else if (calificacion == 4) {
                condicionados++;
            } else {
                suspensos++;
            }
        }

        System.out.println("alumnos aprobados: " + aprobados);
        System.out.println("alumnos condicionados: " + condicionados);
        System.out.println("alumnos suspensos: " + suspensos);

        sc.close();
    }
}