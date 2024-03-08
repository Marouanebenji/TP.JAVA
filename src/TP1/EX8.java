package TP1;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier entier : ");
        int a = scanner.nextInt();
        System.out.print("Entrez le deuxième entier : ");
        int b = scanner.nextInt();
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("Le PGCD est : " + Math.abs(a));

        scanner.close();
    }
}
