package Training.Matrizen;

import OOP.IO;

import java.io.IOException;

import static OOP.IO.readInteger;

public class Kino {

    public static void main(String[] args) throws IOException {
        String[][] saal = erzeugenSaal();
        boolean weiter = true;

        do {

            System.out.println("----MENÜ----");
            anzeigenSaal(saal);

            System.out.println("1. Reservieren");
            System.out.println("2. Stonieren");
            System.out.println("3. Beenden");

            int antwort = IO.readInteger();

            if (antwort == 1) {
                reservierenPlazt(saal);
            } else if (antwort == 2) {
                stonierenPlazt(saal);
            } else{
                weiter = false;
            }
           // System.out.println("Möchten Sie das Menü wieder erneut anzeigen?");
        } while (weiter);
    }

    private static String[][] erzeugenSaal() throws IOException {
        System.out.print("Wie viele Reihen gibt es? ");
        int reihe = readInteger();

        System.out.print("Wie viele Plätze? ");
        int platz = readInteger();

        String[][] saal = new String[reihe][platz];

        for (int i = 0; i < saal.length; i++) {
            for (int j = 0; j < saal[i].length; j++) {
                saal[i][j] = "O";
            }
        }
        return saal;
    }

    private static void anzeigenSaal(String[][] saal) {
        for (int i = 0; i < saal.length; i++) {
            for (int j = 0; j < saal[i].length; j++) {
                System.out.print(saal[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void reservierenPlazt(String[][] saal) throws IOException {
        System.out.println("In welche Reihen möchten Sie reservieren? ");
        int reihe = IO.readInteger() - 1;
        System.out.println("In welche Platz möchten sie reservieren? ");
        int platz = IO.readInteger() - 1;

        if (saal[reihe][platz].equals("X")) {
            System.out.println("Dieses Platz ist schon reserviert bitte wählen Sie einen anderen Platz.");
        }

        saal[reihe][platz] = "X";
        anzeigenSaal(saal);
    }

    private static void stonierenPlazt(String[][] saal) throws IOException {
        System.out.println("In welche Reihen möchten Sie ihre Reservierung stonieren? ");
        int reihe = IO.readInteger() - 1;
        System.out.println("In welche PLatz möchten Sie ihre Reservierung stonieren? ");
        int platz = IO.readInteger() - 1;

        if (saal[reihe][platz].equals("O")) {
            System.out.println("Dieses Platz ist nicht reserviert, das Platz kann nicht stoniert werden.");

        }

        saal[reihe][platz] = "O";
        anzeigenSaal(saal);
    }
}
