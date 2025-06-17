import java.util.Scanner;

public class AskUser {        
        
    
    static void ask(){
        
        Scanner Scanner=new Scanner(System.in);
        boolean WantContinue=true;
        while (WantContinue){
            System.out.println("¿Quieres continuar S/N?");
        String answer = Scanner.nextLine();
        if (answer.toLowerCase().equals("n")){
            WantContinue=false;
        }

        }
    
        Scanner.close();
        System.out.println("Adios");

    }
    public static void main(String[] args) {

        ask();


        }

    
}
    

