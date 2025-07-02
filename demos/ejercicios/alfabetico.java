package demos.ejercicios;

import java.util.Scanner;

public class alfabetico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto:");
        String textoUsuario = scanner.nextLine();

        if (esAlfabetico(textoUsuario)) {
            System.out.println("El texto contiene caracteres alfabéticos.");
        } else {
            System.out.println("El texto no contiene caracteres alfabéticos.");
        }

        scanner.close();
    }

    static boolean esAlfabetico(String texto) {
        // Convertimos a mínusculas temporalmente
        String textoMinusculas = texto.toLowerCase();
        
        // Iterar a través de cada carácter del texto
        for (int i = 0; i < texto.length(); i++) {
            
            // Obtenemos el carácter de la cadena temporal en minúsculas
            char caracter = textoMinusculas.charAt(i);

            // Verificar si el carácter no es una letra del alfabeto
            if (caracter < 'a' || caracter > 'z') {
                // El carácter no es una letra del alfabeto
                return false;
            } 
        }
        
        // Si se llega a este punto, todos los caracteres son letras del alfabeto
        return true;
    }
}
