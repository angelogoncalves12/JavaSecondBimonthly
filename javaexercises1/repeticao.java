package javaexercises1;

import java.util.Scanner;

public class repeticao {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); 
        int numstudents = 30;
        double geralMedia = 0;
        for (int V = 1; V < numstudents; V++){
            System.out.print ("Insert the grade of student: " );
            double grade = sc.nextDouble();

            System.out.print ("Insert the second grade of this student: ");
            double grade2 = sc.nextDouble();

            double media = (grade + grade2) / 2;

            System.out.printf("The media of this student is: %.2f ", media);

            geralMedia += media;
        }
        System.out.printf("The class geral media is: %.2f %n", geralMedia);
        
        sc.close();
    }
}