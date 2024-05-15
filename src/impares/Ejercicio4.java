package impares;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // //declarar variables
        String[] mascota = new  String[10];

        //capturar datos
        System.out.println("Ingrese los nombres de las mascotas:");
        for (int i = 0; i < mascota.length; i++) {
            System.out.print("Mascota " + (i + 1) + ": ");
            mascota[i] = entrada.nextLine();
        }

        System.out.println("Nombres de mascotas:");
        for (int i = 0; i < mascota.length; i += 2) {
            System.out.println("Índice " + i + ": " + mascota[i]);
        }
    }
}
