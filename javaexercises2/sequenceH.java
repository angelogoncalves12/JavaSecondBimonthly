package javaexercises2;
import java.util.Scanner;

public class sequenceH {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insert a integral N number: ");
        int N = sc.nextInt();

        double I;
        double H = 1;
        for (I = 2; I < N + 1; I++){
            H += 1/I;
        }
        System.out.printf("The 'H' number is %.2f ", H);
        sc.close();
    }
}