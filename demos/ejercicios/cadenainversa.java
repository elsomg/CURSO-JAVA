package demos.ejercicios;

import java.util.Scanner;

public class cadenainversa {
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Escribe una palabra o frase");
        String cadena=scanner1.nextLine();
        String invertido="";
        for (int i = cadena.length() - 1; i >= 0; i--) {
             invertido += cadena.charAt(i);
        }
            System.out.println("la cadena inversa es " + invertido);
            
        }
    
}
