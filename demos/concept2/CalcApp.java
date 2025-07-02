package demos.concept2;

public class CalcApp {
public static void main(String[] args) {
    System.out.println("Calculadora");
    CalcController controller= new CalcController();
    CalcView view=new CalcView();
    System.out.println(controller);
    System.out.println(view);
}
}
