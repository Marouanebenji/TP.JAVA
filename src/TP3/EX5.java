package TP3;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lecture de la taille N du tableau
        System.out.print("Entrez la taille du tableau : ");
        int N = scanner.nextInt();

        // Création du tableau T
        int[] T = new int[N];

        // Remplissage du tableau par des valeurs entrées au clavier
        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < N; i++) {
            T[i] = scanner.nextInt();
        }

        // Affichage du tableau original
        System.out.println("Tableau original : ");
        for (int i = 0; i < N; i++) {
            System.out.print(T[i] + " ");
        }
        System.out.println();

        // Inversion des éléments du tableau
        for (int i = 0; i < N / 2; i++) {
            int temp = T[i];
            T[i] = T[N - i - 1];
            T[N - i - 1] = temp;
        }

        // Affichage du tableau inversé
        System.out.println("Tableau inversé : ");
        for (int i = 0; i < N; i++) {
            System.out.print(T[i] + " ");
        }

        scanner.close();
    }
}
