public class numeros {
//COMENTARIOS
/*COMENTARIO
 de muchas
 lineas
 */

    public static void main(String[] args) {
   
        
    System.out.println("Numeros");
    System.out.println("=====TIPOS=====");
    int numero_entero=22; // Asignacion
    Byte Edad=22; //Declaracion
    short fecha_nacimiento=2001;
    float numero_decimal=1.285f; 
    double numeros_decimales=2.398485;
    boolean verdadero=true;
    long numero_largo=1829384848;
    String largo="82874894FFSD";
    char caracter='A';

    System.out.println("Numero entero con int:" + numero_entero );
    System.out.println("Numero edad con byte:" + Edad );
    System.out.println("Numero Fecha de nacimiento con Short:" + fecha_nacimiento );
    System.out.println("Numero Decimal con float:" + numero_decimal );
    System.out.println("Numeros decimales con double:" + numeros_decimales );
    System.out.println("Booleano:" + verdadero );
    System.out.println("Numero largo con long:" + numero_largo );
    System.out.println("Numeros largos y letras con String:" + largo );
    System.out.println("Un caracter unicamente con char:" + caracter );
    System.out.println("""
        Template

        String""");
    System.out.println("""
        Numero int %s entero
        Numero decimal %s decimal
        Numeros decimales %s decimales
        String""".formatted(numero_entero, numero_decimal,numeros_decimales));
     

}
}
