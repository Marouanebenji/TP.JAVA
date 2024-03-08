package TP2;


import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de X : ");
        int x = scanner.nextInt();

        System.out.print("Entrez la valeur de N : ");
        int n = scanner.nextInt();

        int resultat = (int) Math.pow(x, n);
        System.out.println(x + "^" + n + " = " + resultat);
    }
}
