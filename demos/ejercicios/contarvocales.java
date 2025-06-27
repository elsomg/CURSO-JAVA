package demos.ejercicios;

import java.util.Scanner;

public class contarvocales {
    public static void main(String[] args) {
    
           Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine().toLowerCase(); // Convertir a minúsculas para facilitar la comparación
        
        int contadorVocales = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }
        
        System.out.println("La cantidad de vocales es: " + contadorVocales);
    
                
        
           
            
            }
                      
        
                
            
          
          
        
        
            
    }
