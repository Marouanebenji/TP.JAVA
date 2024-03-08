package TP1;
import java.util.Scanner;
public class EX3 {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        int temp;
        System.out.print("Entrez la valeur de a : ");
        int a = scanner.nextInt();
        System.out.print("Entrez la valeur de b : ");
        int b = scanner.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("Après permutation :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        scanner.close();
    }
}
