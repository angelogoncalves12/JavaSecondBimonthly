package javaexercises2;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert a number to stop the Fibonacci sequency: ");
        int stop = sc.nextInt();
e
        int fibonacci = 1;
        int newFibo = fibonacci;
        for (int a = 1; a < stop; a++){
            fibonacci += newFibo;

        }
            System.out.printf("O resultado da sequẽncia até o número %d é de %d %n", stop, fibonacci);
            sc.close();

    }
}
