package TP2;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de N : ");
        int n = scanner.nextInt();

        double somme = sommeHarmonique(n);
        System.out.println("La somme des " + n + " premiers termes de la série harmonique est : " + somme);
    }

    public static double sommeHarmonique(int n) {
        double somme = 0;
        for (int i = 1; i <= n; i++) {
            somme += 1.0 / i;
        }
        return somme;
    }
}
