package impares;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // //declarar variables
        int punto;
        String tipocliente;

        //capturar datos
        System.out.print("Ingrese la cantidad de puntos: ");
        punto = entrada.nextInt();

        //operar valores
        if (punto < 1000) {
            tipocliente = "Bronce";
        } else if (punto > 1000 && punto <= 3000) {
            tipocliente = "Plata";
        } else {
            tipocliente = "Oro";
        }
       //mostrar  el resultado
        System.out.println();
        System.out.println("El tipo de cliente es: " + tipocliente);





    }
}
