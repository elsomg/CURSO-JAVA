import java.util.Scanner;

public class personinput {
    
    public static void main(String[] args) {
        int edad;
        String name;

        Scanner Scanner1=new Scanner(System.in);
        Scanner Scanner2=new Scanner(System.in);

        System.out.println("Dime tu nombre y tu edad");
        name=Scanner1.nextLine();
        edad=Scanner2.nextInt();
        System.out.println("Tu nombre es " + name + " y tu edad es " +edad);
        Scanner1.close();
        Scanner2.close();
    }


}
