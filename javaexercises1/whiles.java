package javaexercises1;
import java.util.Scanner;

public class whiles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        double media = 0;

        while (cont < 5){
            System.out.print ("Insert this student grade: ");
            double grade = sc.nextDouble();
            media += grade;
            cont++;
        }
        System.out.printf("A média das notas é de %.2f", media/5);
        sc.close();
}}