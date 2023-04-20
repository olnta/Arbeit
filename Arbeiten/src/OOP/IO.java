package OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

/**
 * Erzeugt die Methoden:
 * -IO.readString   Eingabe für Texte
 * -IO.readInteger  Eingabe für Ganzzahlen
 * -IO.readDouble   Eingabe für Kommazahlen
 * -IO.readBoolean  Eingabe für Wahrheitswerte
 */

public class IO {
    public static String readString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        return text;
    }

    public static int readInteger() throws IOException {
        /**
         * Schleife fragt ab, ob beim "try" fehler auftreten. Wenn welche auftreten, dann werden
         * sie aufgefangen(catch) und man muss den Wert neu eingeben.
         */
        while (true) {
            try { //IO.readString ist ein String also eine Eingabe und wird in einen int Wert umgewandelt und in x gepackt
                int x = Integer.parseInt(IO.readString().trim().replace(',', '.'));
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Keine Ganzzahl! Bite erneut versuchen: ");
            }
        }
    }

    public static double readDouble() throws IOException {
        while (true) {
            try {
                double x = Double.parseDouble(IO.readString().trim().replace(',', '.'));
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Keine Doublezahl! Bite erneut versuchen: ");
            }
        }
    }

    /**
     * Liest den Wahrheitswert von der Konsole ein
     *
     * @return den Warheitswert
     * @throws IOException
     */
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
        System.out.println("Wie viele Texte sollen erfasst werden?");
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
    

    public static int[][] readIntergerArray2D() throws IOException {
        System.out.print("Wie viele Zeilen? ");
        int zeilen = IO.readInteger();

        System.out.print("Wie viele Spalten? ");
        int spalten = IO.readInteger();
        int[][] array = new int[zeilen][spalten];
        readArray(array);
        return array;
        
    }

    private static void readArray(int[][] array) throws IOException {
        for(int i = 0; i < array.length; i++){
            for( int j = 0; j < array[i].length; j++){
                System.out.println("Wert eingeben für [" + i + "][" + j + "]: " );
                array[i][j] = readInteger();
            }
        }
    }
}

