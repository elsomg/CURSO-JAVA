package demos.ejercicios;

import java.util.Scanner;

public class posiciones {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un texto
        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();

        // Solicitar al usuario una posición
        System.out.print("Ingrese una posición (basada en 0): ");
        int posicion = scanner.nextInt();

        // Validar que la posición esté dentro del rango del texto
        if (posicion < 0 || posicion >= texto.length()) {
            System.out.println("La posición ingresada no es válida para el texto proporcionado.");
            return;
        }

        // Solicitar al usuario una letra
        System.out.print("Ingrese una letra: ");
        char nuevaLetra = scanner.next().charAt(0);

        // Llamar a la función cambiarLetra y mostrar el resultado
        String nuevoTexto = cambiarLetra(texto, posicion, nuevaLetra);
        System.out.println("Nuevo texto: " + nuevoTexto);

        scanner.close();
    }

    // Función para cambiar la letra en la posición especificada del texto
    private static String cambiarLetra(String texto, int posicion, char nuevaLetra) {
        char[] caracteres = texto.toCharArray();
        caracteres[posicion] = nuevaLetra;
        return new String(caracteres);
    }
}
