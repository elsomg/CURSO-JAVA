package demos.ejercicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ejercicio_file {


//     // pregunta al usuario
//     nombre
//     apellido

//     guardalo en un fichero user.txt 
//     muestra al usuario lo que has guardado


    public static void metod(){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Introduce tu nombre");
    
    String entrada=sc.nextLine();
    System.out.println("Introduce tu apellido");
    String entrada2=sc.nextLine();

        try (FileWriter archivo=new FileWriter("archivo.txt")){
            PrintWriter pw = new PrintWriter(entrada, entrada2);
            
            for (int i = 0; i < 10; i++)
                pw.println("Linea " + i);
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }
    
    

    
public static void main(String[] args) {
    metod();
    sc.close();
}
    
}
