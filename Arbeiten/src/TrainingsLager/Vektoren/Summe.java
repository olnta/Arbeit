package TrainingsLager.Vektoren;

import OOP.IO;
import com.sun.security.jgss.GSSUtil;

import java.io.IOException;

public class Summe {

    public static void main(String[] args) throws IOException {

        System.out.print("Wie viele Zahlen wollen Sie berechnen?");
        int gz = IO.readInteger();
        double array[] = new double[gz];

        for ( int i = 0; i < array.length; i++){
            System.out.print("Wert " + (i + 1) + " eingeben: ");
            array[i] = IO.readDouble();
        }

        int gerade = 0;
        int ungerade = 0;
        int anzahl = 0;
        int unanzahl = 0;


        for(int i = 0; i < array.length; i++){
            //Modulo-Operation
            if((array[i] % 2) == 0){
                gerade += array[i];
                anzahl++;

            }else {
                ungerade += array[i];
                unanzahl++;
            }
        }

        System.out.println("\nGeraden Zahlen: ");
        System.out.println("Anzahl = " + anzahl);
        System.out.println("Summe = " + gerade);
        System.out.println("\nUngerade Zahlen: ");
        System.out.println("Anzahl = " + unanzahl);
        System.out.println("Summe = " + ungerade);
    }
}
