import java.util.Random;

public class bucleWhile {
    public static void main(String[] args) {
        boolean sentinel=true;
        while (sentinel){
            Random randomcreator=new Random();
            int number =randomcreator.nextInt(9);
            System.out.println("Número " + number);
            if (number==7){
                sentinel=false;
            }
        }
    }
}
