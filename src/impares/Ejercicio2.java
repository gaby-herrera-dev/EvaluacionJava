package impares;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);

        //declarar variables
         int num;

        //capturar datos
        System.out.print("Ingrese un número entero positivo: ");
        num = entreda.nextInt();

        //operar valores
            int i = 1;
        System.out.println("Números impares entre 0 y " + num + ":");
        while (i <= num) {
            System.out.println(i);
            i += 2;
        }
    }
}
