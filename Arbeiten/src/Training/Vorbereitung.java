package Training;

import OOP.IO;

import java.io.IOException;
import java.text.DecimalFormat;

public class Vorbereitung {

    public static void main(String[] args) throws IOException {

        DecimalFormat df = new DecimalFormat("#,####0.000");

        System.out.print("Eingabe von n Zahlen: ");
        int n = IO.readInteger();
        double zahlen[] = new double [n];

        for (int i = 0; i <zahlen.length; i++) {
            System.out.print("Nummer " + (i + 1) + ": ");
            zahlen[i] = IO.readDouble();
        }

        //Summe arithmetisches Mittel
        double durch = ermittelnDurchschnitt(zahlen);

        //Maximum
        double max = ermittelnMax(zahlen);

        System.out.println("Der Max nummer ist: " + df.format(max));
        System.out.println("Der Durchschnitt ist: " + df.format(durch));


    }

    private static double ermittelnDurchschnitt(double[] zahlen){
        double summe = 0;
        for (int i = 0; i < zahlen.length; i++) {
            summe += zahlen[i];
        }
        double durchschnitt = summe / zahlen.length;
        return durchschnitt;
    }

    private static double ermittelnMax(double[] zahlen) {
        double max = zahlen[0];
        for(int i = 0; i < zahlen.length; i++){
            max = Math.max(max, zahlen[i]);
        }
        return max;
    }

}
