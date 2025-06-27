package demos.ejercicios;

import java.util.Scanner;

public class numeromayor {
    public static void main(String[] args) {
        
    
     Scanner scanner = new Scanner(System.in);

// //Esta línea crea un array de enteros llamado numeros
        //  con capacidad para 5 elementos.
        int []numeros=new int[5]; 


          // Pedir al usuario que ingrese 5 números
//   Comienza un bucle for que se repetirá 5 veces (de 0 a 4).

// i es el contador que indica la posición actual en el array.
        for (int i = 0; i < numeros.length; i++) {


        System.out.println("Ingresa el numero" + (i+1));

        //Muestra un mensaje en pantalla pidiendo el número en 
        //la posición (i+1) (para que empiece en 1, no en 0).
        numeros[i]=scanner.nextInt();
        //Lee el número que escribe el usuario y 
        //lo guarda en la posición i del array numeros.
        }
        
        int mayor = numeros[0];
        //int mayor = numeros[0];



        //Otro bucle for que recorre el arreglo desde la posición 1 hasta el final.
        for (int i = 1; i < numeros.length; i++) {

            //Dentro del bucle, compara el número actual con el valor guardado en mayor.
            if (numeros[i] > mayor) {

                //Si el número actual es mayor que el mayor actual, 
                //actualiza la variable mayor con ese número.

                mayor = numeros[i];
            }
        }
        
        System.out.println("El número mayor es: " + mayor);



    }
}
