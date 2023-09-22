package Training.Matrizen;

import OOP.IO;

import java.io.IOException;

public class Lieferungen {
    public static void main(String[] args) throws IOException {

        System.out.print("Wie viele Artikel wurden bestellt? ");
        int artikel = IO.readInteger();

        System.out.print("Wie vielen Kunden haben bestellt? ");
        int kunden = IO.readInteger();

        int[][] jan = new int[artikel][kunden];
        int[][] feb = new int[artikel][kunden];
        gibMatrix("Januar", jan);
        gibMatrix("Februar", feb);
        lieferungAnzeigen(jan);
        System.out.println("----------------");
        lieferungAnzeigen(feb);

       // int summe[][] = summeRechnen(jan,feb);

        System.out.println("\n");
    }

   // private static int[][] summeRechnen(int[][] jan,int[][]feb) {


    //}





    private static void lieferungAnzeigen(int[][] jan) {
        for (int i = 0; i < jan.length; i++) {
            for (int j = 0; j < jan[i].length; j++) {
                System.out.print(jan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void gibMatrix(String text, int[][] jan) throws IOException {
        System.out.println("Geben Sie nun die Matrix für den Monat " + text + " ein");

        for (int i = 0; i < jan.length; i++) {
            for (int j = 0; j < jan[i].length; j++) {
                System.out.print("Artikel " + (i + 1) + " für Kunde " + (j + 1) + ": ");
                jan[i][j] = IO.readInteger();
            }
            System.out.println();
        }
    }
}

