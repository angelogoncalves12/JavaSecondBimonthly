package javaexercises2;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert a number of thermes to stop the Fibonacci sequency: ");
        int stop = sc.nextInt();

        int fibonacci = 1;
        
        int num1 = 1;
        int num2 = 2;
        int num3 = 0;

        if (stop >= 1){
            System.out.println("1");
        }
        if (stop >= 2){
            System.out.println("1");
        }
        if (stop == 3){
            System.out.println("2");
        }

        if (stop > 3){
        for (int a = 1; a < stop; a++ ){
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
        }
            sc.close();

    }
}
