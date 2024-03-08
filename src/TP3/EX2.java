package TP3;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tableau = new int[10];

        System.out.println("Veuillez saisir 10 entiers pour remplir le tableau :");
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = scanner.nextInt();
        }
        System.out.println("Contenu du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Élément " + (i + 1) + " : " + tableau[i]);
        }
    }
}
