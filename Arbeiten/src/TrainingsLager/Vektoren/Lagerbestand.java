package TrainingsLager.Vektoren;

import OOP.IO;

import java.io.IOException;
import java.text.DecimalFormat;

public class Lagerbestand {

    public static void main(String[] args) throws IOException {

        System.out.print("Wie viele unterschieldlich Artikel haben Sie im Lager?");
        int gz = IO.readInteger();


        String[] artikel = new String[gz];

        for (int i = 0; i < artikel.length; i++) {
            System.out.print("Artikel " + (i + 1) + ": ");
            artikel[i] = IO.readString();
        }


        double[] preis = new double[gz];

        System.out.println("Erfassen Sie jetzt den Einzelpreis jedes Artikels: ");
        for (int i = 0; i < artikel.length; i++) {
            System.out.print("Preis des Artikels " + artikel[i] + ": ");
            preis[i] = IO.readDouble();
        }


        int[] menge = new int[gz];

        System.out.println("Erfassen Sie jetzt die Anzahl der einzelnen Artikel:");
        for (int i = 0; i < artikel.length; i++) {
            System.out.print("Menge des Artikels " + artikel[i] + ": ");
            menge[i] = IO.readInteger();
        }

        DecimalFormat df = new DecimalFormat("#,##0.00 €"); //Genau 2 Dezimalstellen

        int gesamtmenge = 0;
        for (int i = 0; i < menge.length; i++) {
            gesamtmenge += menge[i];
        }

        double gesamtpreis = 0;
        for (int i = 0; i < artikel.length; i++) {
            gesamtpreis += preis[i] * gesamtmenge;
        }


        System.out.println("In ihrem Lager befinden sich ingesamt " + gesamtmenge + " Artikel im Wert von " + df.format(gesamtpreis) + ".");

    }
}
