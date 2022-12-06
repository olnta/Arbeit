package TrainingsLager;

import OOP.IO;

import java.io.IOException;

public class Widerstand {

    public static void main(String[] args) throws IOException {

        System.out.println("Möchten Sie den Widerstand einer Parallelschaltung oder einer Reihenschaltung rechnen. Wählen Sie bitte P oder R.");
        String eingabe =IO.readString();
        if ( eingabe.equals("R")){

            System.out.println("Geben sie R1 ein");
            double r1 = IO.readDouble();
            System.out.println("Geben Sie r2 ein");
            double r2 = IO.readDouble();
            double wiederstand = r1 + r2;
            System.out.println(wiederstand);
        } else if (eingabe.equals("P")){

            System.out.println("Geben sie R1 ein");
            double r1 = IO.readDouble();
            System.out.println("Geben Sie r2 ein");
            double r2 = IO.readDouble();
            double widerstand1 = ((r1 + r2) / (r1 + r2));
            System.out.println(widerstand1);
        }


    }

}
