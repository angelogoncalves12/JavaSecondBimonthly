package javaexercises1;

import java.util.Scanner;

public class infiniterepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;
        double grade = 0;
        double cont = 0;

        while (grade != 99) { 
            System.out.print ("Whats the grade of this student? ");
            grade = sc.nextDouble();
            
            if (grade != 99){
                media += grade;
                cont++;
            }
        }
        System.out.printf("The media of this grades is: %.2f %n", media/cont);
        sc.close();
    }
}
