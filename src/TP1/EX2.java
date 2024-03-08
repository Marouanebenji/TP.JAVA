package TP1;

import java.util.Scanner;
import java.util.Scanner;
public class EX2 {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir le rayon du cercle : ");
        double r = scanner.nextDouble();
        double surface = Math.PI * r * r;
        double perimetre = 2 * Math.PI * r;
        System.out.println("Surface du cercle : " + surface);
        System.out.println("Périmètre du cercle : " + perimetre);

        scanner.close();
    }
}




