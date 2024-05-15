package impares;

import java.util.Scanner;

public class Ejercicios1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //declarar variables
        double respuestacorrecta, respuestaincorrecta,respuestavacia, puntajetotal;


        //capturar datos
        System.out.print("Ingrese el número de respuestas correctas: ");
        respuestacorrecta = entrada.nextDouble();

        System.out.print("Ingrese el número de respuestas incorrectas: ");
        respuestaincorrecta = entrada.nextDouble();

        System.out.print("Ingrese el número de respuestas vacías: ");
        respuestavacia = entrada.nextDouble();

        //operar valores
        puntajetotal = (respuestacorrecta * 5) + (respuestaincorrecta * -2) + (respuestavacia * 0);

        //mostrar  el resultado
        System.out.println("El puntaje obtenido es: " + puntajetotal);

    }
}
