import java.util.Scanner;

public class horarios {
    
    public static void main(String[] args) {

        /*Una escuela de inglés desea informar a sus alumnos los días y horarios de sus clases. 
        Para ello, decidió la creación de una aplicación que, a partir del ingreso de la edad 
        del alumno, le informe en qué días y horarios los alumnos tienen clases. 
        Como información, la academia proporciona los siguientes datos respecto a los grupos 
        y los diferentes horarios:

Kinder (de 6 años inclusive): Lunes y Miércoles de 16 a 17
1stYear (de 7 a 8 años inclusive): Martes y Jueves de 16:30 a 17:30
2ndYear (de 9 a IO años inclusive): Martes y Jueves de 17:30 a 19
3rdYear (de ll a 13 años inclusive): Lunes y Miércoles de 17 a 18:30 
Realizar el programa solicitado por el instituto, donde a partir del ingreso de la EDAD 
del alumno, el sistema informe por pantalla los días y horarios del curso correspondiente /*
 */
        Scanner scanner1= new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int age=scanner1.nextInt();
        if (age == 6){
            System.out.println("Lunes y Miércoles de 16 a 17");
        }
            else if(age <=8){
                System.out.println("Martes y Jueves de 16:30 a 17:30");
            }
            else if(age <=10){
                    System.out.println("Martes y Jueves de 17:30 a 19");
            
            }
            else if(age <=13){
                    System.out.println("Lunes y Miércoles de 17 a 18:30");
            

        }
    }
}

