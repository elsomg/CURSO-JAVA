package demos.ejercicios;

import java.util.Scanner;

public class factorial2 {
    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo: ");
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.println("No se puede calcular el factorial de un número negativo.");
        } else {
            long fact = factorial(numero);
            System.out.println("El factorial de " + numero + " es: " + fact);
        }
    }
}
