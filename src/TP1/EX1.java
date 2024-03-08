package TP1;
import java.util.Scanner;



            public class EX1 {
                public static void main(String[] args) {


                    System.out.println("Entrez le premier entier : ");
                    Scanner scanner = new Scanner(System.in);
                    int n1 = scanner.nextInt();
                    System.out.print("Entrez le deuxième entier : ");
                    int n2 = scanner.nextInt();
                    System.out.println("Somme : " + (n1 + n2));
                    System.out.println("Différence : " + (n1 - n2));
                    System.out.println("Produit : " + (n1 * n2));

                    // Vérification de la division par zéro
                    if (n2 != 0) {
                        System.out.println("Quotient : " + ((double) n1 / n2));
                    } else {
                        System.out.println("Division par zéro impossible");
                    }

                    scanner.close();
                }
            }

