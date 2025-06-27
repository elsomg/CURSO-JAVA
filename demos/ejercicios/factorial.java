package demos.ejercicios;
import java.util.Scanner;
public class factorial {
     // Importa la clase Scanner para leer datos desde el teclado

    // Método que calcula el factorial de un número entero
    public static long factorial(int n) {
        long resultado = 1; // Inicializa la variable resultado en 1 (factorial de 0 es 1)
        
        // Bucle desde 2 hasta n para multiplicar todos los números en ese rango
        for (int i = 2; i <= n; i++) {
            resultado *= i; // Multiplica resultado por i en cada iteración
        }
        
        return resultado; // Devuelve el valor calculado del factorial
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para entrada de datos
        
        System.out.print("Ingresa un número entero positivo: "); // Pide al usuario que ingrese un número
        int numero = sc.nextInt(); // Lee el número ingresado y lo guarda en la variable numero
        
        // Verifica si el número es negativo
        if (numero < 0) {
            System.out.println("No se puede calcular el factorial de un número negativo."); // Mensaje de error
        } else {
            long fact = factorial(numero); // Llama al método factorial con el número ingresado
            System.out.println("El factorial de " + numero + " es: " + fact); // Muestra el resultado
        }
    }
}


