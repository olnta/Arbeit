package Training;

import OOP.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class LK3_Brachimi {

    public static void main(String[] args) throws IOException {
        do {
            DecimalFormat df = new DecimalFormat("#,####0.0000");

            System.out.print("Wie viele Werte möchten Sie eingebe? ");
            int werte = IO.readInteger();
            double array[] = new double[werte];

            for (int i = 0; i < array.length; i++) {
                System.out.print("Wert " + (i + 1) + ": ");
                array[i] = IO.readDouble();
            }


            double min = ermittelnMin(array);
            double max = ermittelnMax(array);
            double mittelwert = berechneMittelwert(array);
            double varianz = berechneVarianz(array);
            double sa = berechneStandardabweichung(array);


            System.out.println("Das Minimum ist: " + df.format(min));
            System.out.println("Das Maximum ist: " + df.format(max));
            System.out.println("Der Mittelwert ist: " + df.format(mittelwert));
            System.out.println("Die Varianz ist: " + df.format(varianz));
            System.out.println("Die Standardabweichung ist: " + df.format(sa));

        } while (IO.readBoolean());
    }

    private static double ermittelnMin(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {

            min = Math.min(min, array[i]);

        }
        return min;
    }

    private static double ermittelnMax(double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {

            max = Math.max(max, array[i]);

        }
        return max;
    }

    private static double berechneMittelwert(double[] array) {
        double mittelwert = 0;
        for (int i = 0; i < array.length; i++) {
            mittelwert += array[i];
        }
        double durchschnitt = mittelwert / array.length;
        return durchschnitt;
    }

    private static double berechneVarianz(double[] array) {
        double varianz = 0;
        for (int i = 0; i < array.length; i++) {
            varianz += (Math.pow(array[i] - berechneMittelwert(array), 2));
        }

        return varianz / array.length;
    }

    private static double berechneStandardabweichung(double[] array) {
        return Math.sqrt(berechneVarianz(array));
    }

     //=========================================================
     public static String readString() throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String text = br.readLine();
         return text;
     }

    public static boolean readBoolean() throws IOException {
        while (true) {
            String x = readString();
            /**
             * !x = nicht gleich/ungleich
             * null = NICHTS
             */
            if (x != null) {
                if ((x.equalsIgnoreCase("Ja"))
                        || (x.equalsIgnoreCase("j"))
                        || (x.equalsIgnoreCase("Yes"))
                        || (x.equalsIgnoreCase("y"))) {
                    return true;
                } else if ((x.equalsIgnoreCase("Nein"))
                        || (x.equalsIgnoreCase("n"))
                        || (x.equalsIgnoreCase("No"))) {
                    return false;
                }
            }
            System.out.println("Ungültige eingabe! Bitte erneut versuchen.");
        }
    }

    public static int[] readArrayInteger() throws IOException {

        //Deklaration
        int[] zahlen;

        //Größe abfragen
        System.out.println("Wie viele Zahlen sollen erfasst werden");
        int groesse = IO.readInteger();

        //Array Initialisieren
        zahlen = readArrayInteger(groesse);

        return zahlen;
    }

    public static int[] readArrayInteger(int anzahl) throws IOException {

        //Deklaration
        int[] zahlen = new int[anzahl];

        for (int i = 0; i < zahlen.length; i++) {
            System.out.print("Bitte erfassen sie den Wert " + (i + 1) + ": ");
            zahlen[i] = IO.readInteger();
            System.out.println(" ");
        }
        return zahlen;
    }

    public static double[] readArrayDouble() throws IOException {
        //Deklaration
        double[] zahlen;

        //Größe abfragen
        System.out.println("Wie viele Zahlen sollen erfasst werden");
        int groesse = IO.readInteger();

        //Array Initialisieren
        zahlen = readArrayDouble(groesse);

        return zahlen;
    }

    public static double[] readArrayDouble(int anzahl) throws IOException {
        //Deklaration
        double[] zahlen = new double[anzahl];

        for (int i = 0; i < zahlen.length; i++) {
            System.out.print("Bitte erfassen sie den Wert " + (i + 1) + ": ");
            zahlen[i] = IO.readDouble();
            System.out.println(" ");
        }
        return zahlen;
    }

    public static String[] readArrayString() throws IOException {
        //Deklaration
        String[] texte;

        //Größe abfragen
        System.out.println("Wie viele Texte sollen erfasst werden");
        int groesse = IO.readInteger();

        //Array Initialisieren
        texte = readArrayString();

        return texte;
    }

    public static String[] readArrayString(int anzahl) throws IOException {
        //Deklaration
        String[] texte = new String[anzahl];

        for (int i = 0; i < texte.length; i++) {
            System.out.print("Bitte erfassen sie den Wert " + (i + 1) + ": ");
            texte[i] = IO.readString();
            System.out.println(" ");
        }
        return texte;
    }
}
