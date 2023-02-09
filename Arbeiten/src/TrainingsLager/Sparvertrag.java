package TrainingsLager;

import OOP.IO;

import java.io.IOException;

public class Sparvertrag {

    public static void main(String[] args) throws IOException {

        System.out.print("Bitte Kapital eingeben: ");
        double kapital = IO.readDouble();

        System.out.print("Bitte den Zinssatz eingeben: ");
        double zinsen = IO.readDouble();

        System.out.print("Bitte die Laufzeit ein Jahren eingeben: ");
        int laufzeit = IO.readInteger();


        double jaresendbetrag = zinsen + kapital;

        zinsen = kapital * zinsen;


        System.out.println("\nJahre         Zellmenge");

        for (int i= 1; i <= laufzeit ; i++){

            double zinssatz = (zinsen * kapital) / 100;
            System.out.println(i +"\t\t\t" + kapital + "\t\t\t" + zinssatz + "\t\t\t" + jaresendbetrag);

        }



    }

}
