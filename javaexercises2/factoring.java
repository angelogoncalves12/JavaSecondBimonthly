package javaexercises2;
import java.util.Scanner;

public class factoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insert a integral number to factoring: ");
        int fac = sc.nextInt();
        int begin = fac;
        int newFac = fac;
        
        while (fac > 1){
            fac --;
            newFac *= fac;
        }
        System.out.printf("The result of %d! is %d \n", begin, newFac); 
        sc.close();
    }
}
