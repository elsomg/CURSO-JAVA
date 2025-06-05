/* TIPOS DE PRINT
 * println
 * printf
 * String template
 */

public class out {

public static void main(String[] args) {
    String name="Pepe";
    String surname="Pérez";
    int age=33;
    System.out.println("Hola " + name + " " + surname + "\n¿cómo estás a tus " + age + " años?");
    System.out.println("Hola " + name + "\n¿cómo estás? ");
    System.out.printf("Hola %s %s,\ncómo estás a tus %s años? ", name, surname, age);
    System.out.println("""
            Hola %s %s, 
            ¿cómo estás a tus %s años?
            """.formatted( name, surname, age ));
}

}
