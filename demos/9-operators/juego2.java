import java.util.Random;
import java.util.Scanner;

public class juego2 {
public static void main(String[] args) {
    
   

    Scanner Scanner1=new Scanner(System.in);
    System.out.println("Introduce un numero");
    int number=Scanner1.nextInt();
    Random randomcreator=new Random();
    int random2 = randomcreator.nextInt();
    System.out.println(random2);
    if (random2==number){
        System.out.println("Enhorabuena, has acertado");
    }    else if (random2!=number){
        System.out.println("Has fallado");
       
    }

}
}



