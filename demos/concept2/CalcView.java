package demos.concept2;

import java.util.Scanner;

public class CalcView extends Calc{

    Scanner scanner=new Scanner(System.in);
    void menu(){

    }
    void show(){

    }
    boolean wantcontinue=true;

    while (wantcontinue){
        System.out.println("Quieres continuar?");
        String answer=scanner.nextLine();
        if (answer.toLowerCase().equals("n") ||
            (answer.toLowerCase()).equals("no")){
                wantcontinue=false;
            }


    }
    @Override
    public String toString() {
        String className = getClass().getSimpleName();
        String hash=Integer.toHexString((hashCode()));
        return "%s [%s]".formatted(className,hash);
    }



}
