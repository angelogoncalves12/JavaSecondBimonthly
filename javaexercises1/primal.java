package javaexercises1;
import java.util.Scanner;

public class primal {
    public static void main (String[] args){
        java.util.Scanner sc = new Scanner(System.in);

        System.out.print ("Insert a integer random number: ");
        int number = sc.nextInt();

        int cont = 1;
        int soma = 0;

        if (number <= 0) {
            System.out.println("Apenas inteiros positivos! ");
            sc.close();
            return;
        } 

        for (int V = 1; V < number; V++){
            if (number % cont == 0) {
            soma++;          
            }
        }
        
        
        if (soma <= 2){
            System.out.println("This number not a primal");
        } else {
            System.out.println("This number is primal!!");
        }
        sc.close();
    }
}