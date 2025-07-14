package demos.ejercicios.shapes;

public class triangle implements Shape{
    double width=2;
    double height=4;
    double area=width*height;
    public triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @override
    public
    double calculateArea() {
        System.out.println("el area del triangulo es" + (area));
        return area;
    }
    
}
