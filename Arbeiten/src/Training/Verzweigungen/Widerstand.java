package Training.Verzweigungen;

import OOP.IO;

import java.io.IOException;

public class Widerstand {

    public static void main(String[] args) throws IOException {

        double r1 = 0;
        double r2 = 0;
        String eingabe;

        System.out.println("Möchten Sie den Widerstand einer Parallelschaltung oder einer Reihenschaltung rechnen. Wählen Sie bitte P oder R.");
        eingabe = IO.readString();

        if (eingabe.equalsIgnoreCase("R")) {

            System.out.println("Geben sie R1 ein");
            r1 = IO.readDouble();
            System.out.println("Geben Sie r2 ein");
            r2 = IO.readDouble();
            double reihenschaltung = r1 + r2;
            System.out.println(reihenschaltung);
        } else if (eingabe.equalsIgnoreCase("P")) {

            System.out.println("Geben sie R1 ein");
            r1 = IO.readDouble();
            System.out.println("Geben Sie r2 ein");
            r2 = IO.readDouble();
            double parallelschaltung = (r1 + r2 / (r1 + r2));
            System.out.println(parallelschaltung);
        }


    }

}
