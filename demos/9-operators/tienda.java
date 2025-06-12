import java.util.Scanner;

public class tienda {
    static final double packet_price = 20;
    static int getdataByscanner(){
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Ingresa la cantidad de paquetes");
        int numpackets=scanner1.nextInt();
        scanner1.close();
        return numpackets;

    }
     public static void main(String[] args) {
        int numpackets=getdataByscanner();
        System.out.println(numpackets);
        int shippingvalue = 5;
        
     
        double discount = 0;
        if (numpackets<5){
            System.out.println("No se puede");
        }
            else if (numpackets<10){
                System.out.println("el coste de envio es del 10 EU de descuento");
            } else if (numpackets > 20){
                System.out.println("Más de 20");
            } else {
                discount=0.15;
                shippingvalue=0;
                System.out.println("gratuito");
            }
                double total=numpackets*packet_price;
                double finaldiscount=total*discount;
                double totalshipping=numpackets*shippingvalue;
                double finalprice=total - finaldiscount + totalshipping;
                System.out.println("""
                        numero de paquetes %s
                        precio total del producto %s
                        precio de venta %s
                        """.formatted(total,finaldiscount,totalshipping,finalprice));
        }

    }

