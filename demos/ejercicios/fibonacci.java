package demos.ejercicios;

import java.util.Scanner;

public class fibonacci {
    
    public static void main (String[] args) {
         Scanner sc=new Scanner(System.in);
        int t1 = 0, t2 = 1;
        System.out.print("Introduce un numero: ");
        int n=sc.nextInt();  
        System.out.println("Primeros " + n + " numeros de fibonacci: ");
        for (int i = 0,j=1; i < n; i++)
        {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
