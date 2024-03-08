package TP1;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int n = scanner.nextInt();
        long f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        System.out.println("La factorielle de " + n + " est : " + f);
        scanner.close();
    }
}
