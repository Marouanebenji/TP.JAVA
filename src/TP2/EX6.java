package TP2;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre entier positif : ");
        int n = scanner.nextInt();
        boolean Premier = true;

        if (n <= 1) {
            Premier = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    Premier = false;
                    break;
                }
            }
        }

        if (Premier) {
            System.out.println(n + " est un nombre premier.");
        } else {
            System.out.println(n + " n'est pas un nombre premier.");
        }
    }
}