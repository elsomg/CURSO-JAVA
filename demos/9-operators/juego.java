import java.util.Random;

public class juego {
public static void main(String[] args) {
    double random=Math.random();
    System.out.println(random);
    Random randomcreator=new Random();
    int random2= randomcreator.nextInt(9)+1;
    System.out.println(random2);
    
}
}
