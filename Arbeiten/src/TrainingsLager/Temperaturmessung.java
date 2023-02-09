package TrainingsLager;

import OOP.IO;

import java.io.IOException;
import java.util.ArrayList;

public class Temperaturmessung {

    public static void main(String[] args) throws IOException {

        System.out.println("Für wie viele tagen möchten Sie die Temperatur messen?");
        int tage = IO.readInteger();
        double arr[] = new double[tage];


        // Eingabe der Werte
        //arr = IO.readArrayDouble(tage);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Geben Sie die Temperatur am Tag " +(i+1)+ " ein: ");
            arr[i] = IO.readDouble();
        }


        // Mittelwert berechnen
        double summe = 0;
        for (int i = 0; i < arr.length; i++) {
            summe = summe + arr[i];
        }

        double mittelwert = summe / arr.length;
        System.out.println("Mittelwert von die Temperatur: " + mittelwert);

        //Ermittlung Höchsttemperatur bzw. Max
        double max = arr[0];
        for (int i = 0; i < arr.length; i++){

            if(max < arr.length){
                max = arr.length;
            }
        }

        System.out.println("Die Höchstemperatur ist: " + max);
    }
}
