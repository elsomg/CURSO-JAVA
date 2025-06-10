public class shape {
    
    public static double calculateSquare(double side){
        double shape=side*side;
        return shape;
    }
    public static void main(String[] args) {
        double result=calculateSquare(2);
        System.out.println("el area es: " + result);
        System.out.println(calculateSquare(2.5));
        System.out.println(calculateSquare(10.5));
    }
}
