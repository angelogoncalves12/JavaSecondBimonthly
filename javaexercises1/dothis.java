package javaexercises1;

import java.util.Scanner;
public class dothis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 1;
        double media = 0;
        do { 
            System.out.print("Insert this student grade: ");
            double grade = sc.nextDouble;
            
            media += grade;
            cont ++;

        } while (cont <= 5);
        System.out.printf("The geral media of this grades is: %.2f %n", media/5);
    }
}