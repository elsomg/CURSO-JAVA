import java.util.Scanner;

public class agegreeting{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int age=input.nextInt();
        if (age >= 18){
            System.out.println("Hola eres mayor de edad");
        }
        else 
            System.out.println("Eres menor de edad");
        
        
        if (age >= 33){
            System.out.println("Hola eres mas mayor");
        }
        else 
            System.out.println("Eres joven");
        
            
    }
}
