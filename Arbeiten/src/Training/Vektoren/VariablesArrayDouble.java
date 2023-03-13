package Training.Vektoren;

import OOP.IO;

import java.io.IOException;

public class VariablesArrayDouble {
    public static void main(String[] args) throws IOException {
        //Deklaration
        double[] zahlen;

        //Größe abfragen
        System.out.println("Wie viele Zahlen sollen erfasst werden");
        int groesse = IO.readInteger();

        //Array Initialisieren
        zahlen = new double[groesse];

        for (int i = 0; i < zahlen.length; i++) {
            System.out.print("Bitte erfassen sie den Wert " + (i + 1) + ": ");
            zahlen[i] = IO.readDouble();
            System.out.println(" ");
        }
        //ausgabe der erfassten zahlen
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
    }
}

