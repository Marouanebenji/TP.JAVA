package TP3;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Entrez la taille du tableau : ");
        int N = scanner.nextInt();


        int[] T = new int[N];


        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < N; i++) {
            T[i] = scanner.nextInt();
        }


        System.out.println("Tableau original : ");
        afficherTableau(T);


        int[] TP = new int[N];
        int[] TN = new int[N];
        int indexTP = 0;
        int indexTN = 0;


        for (int i = 0; i < N; i++) {
            if (T[i] > 0) {
                TP[indexTP++] = T[i];
            } else if (T[i] < 0) {
                TN[indexTN++] = T[i];
            }
        }


        System.out.println("Tableau TP (valeurs positives) : ");
        afficherTableau(TP, indexTP);


        System.out.println("Tableau TN (valeurs négatives) : ");
        afficherTableau(TN, indexTN);

        scanner.close();
    }


    public static void afficherTableau(int[] tableau, int longueur) {
        for (int i = 0; i < longueur; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();
    }


    public static void afficherTableau(int[] tableau) {
        afficherTableau(tableau, tableau.length);
    }
}
