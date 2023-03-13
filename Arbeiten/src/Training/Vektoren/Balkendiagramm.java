package Training.Vektoren;

import OOP.IO;

import java.io.IOException;

public class Balkendiagramm {

    public static void main(String[] args) throws IOException {

        System.out.print("Wie viele Kandidaten sind noch im Rennen? ");
        int az = IO.readInteger();
        double array[] = new double[az];

        System.out.print("\nErfassen Sie jetzt die prozentuale Verteilung des Votings.\n");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Kandidat " + (i + 1) + ":");
            array[i] = IO.readDouble();
        }

        System.out.println("\nErgebnis");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Kandidat " + (i + 1) + ": ");

            for (int i2 = 0; i2 < array[i]; i2++) {
                System.out.print("*");
            }

            System.out.println(" " + array[i] + "%");
        }


    }
}
