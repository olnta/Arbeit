package TrainingsLager.Verzweigungen;

import OOP.IO;

import java.io.IOException;

public class Bestellung {
    public static void main(String[] args) throws IOException {
        do {
            double s = 0.5;
            double m = 0.3;
            double u = 0.1;
            System.out.println("Wie viele Schrauben möchten Sie kaufen?");
            double schrauben = IO.readDouble();
            double summeSchrauben = s * schrauben;

            System.out.println("Wie viele Muttern möchten Sie kaufen?");
            double muttern = IO.readDouble();
            double summeMuttern = m * muttern;

            System.out.println("Wie viele Unterlegscheibe möchten Sie kaufen? ");
            double unterlegscheiben = IO.readDouble();
            double summeUnterlegscheiben = u * unterlegscheiben;

            double summe = summeMuttern + summeSchrauben + summeUnterlegscheiben;

            if (schrauben == muttern) {
                System.out.println("Die Bestellung ist möglich!");
                System.out.println("Das kostet " + summe + "€");
            } else {
                System.out.println("Die Bestellung ist nicht möglich!");
                System.out.print("Möchten Sie die Bestellung neu aufnehmen? j - n");
            }
        } while (IO.readBoolean());

    }
}
