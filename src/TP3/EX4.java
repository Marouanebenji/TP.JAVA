package TP3;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        int N;
        int numind=0;
        int[] ind;
        Scanner in=new Scanner(System.in);
        do{
            System.out.println("Entrer la taille (comprise entre 10 et 50) : ");
            N=in.nextInt();
        }while(N<10 || N>50 );
        char[] table=new char[N];
        for(int i=0;i<table.length;i++){
            System.out.println("Entrer l'element : "+(i+1));
            table[i]=in.next().charAt(0);
        }

        for(int i=0;i<table.length;i++){
            System.out.println("l'elem1ent "+(i+1)+" : "+table[i]);
        }
        for(int i=0;i<table.length;i++){
            if(table[i]=='5'){
                numind++;
            }
        }

        ind=new int[numind];
        char[] newarray=new char[table.length-numind];
        System.out.println("\nla nouvelle liste\n");
        for(int i=0,j=0;i<table.length;i++){
            if(table[i] != '5'){
                newarray[j]=table[i];
                j++;
            }
        }
        for(int i=0;i<newarray.length;i++){
            System.out.println("L'element "+(i+1)+" : "+newarray[i]);
        }

    }
}
