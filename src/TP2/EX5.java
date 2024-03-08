package TP2;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {

        // (AVEC BOUCLE WHILE)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier : ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Le factoriel d'un nombre négatif n'existe pas. Merci de saisir un autre nombre.");
        } else {
            int resultat = 1;
            int i = 1;
            while (i <= n) {
                resultat *= i;
                i++;
            }

            System.out.println(n + "! = " + resultat);
        }


        //avec boucle FOR
/*
        System.out.print("Entrez un entier : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Le factoriel d'un nombre négatif n'existe pas. Merci de saisir un autre nombre.");
        } else {
            int resultat = 1;
            for (int i = 1; i <= n; i++) {
                resultat *= i;
            }

            System.out.println(n + "! = " + resultat);
        }
*/
    }
    }
