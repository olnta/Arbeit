package TrainingsLager.Vektoren;

import OOP.IO;

import java.io.IOException;

public class Maxima {
    public static void main(String[] args) throws IOException {

        System.out.println("Bitte geben Sie ein Array aus Kommazahlen ein. ");
        System.out.print("Wie viele Werte? ");
        int kz = IO.readInteger();
        double array[] = new double[kz];

        for ( int i = 0; i < array.length; i++){
            System.out.print("Wert " + (i + 1) + " eingeben: ");
            array[i] = IO.readDouble();
        }

        double max = array[0];

        for(int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }


        System.out.println("Größte Zahl: " + max);
        System.out.println("Zweite Zahl: ");
    }
}
