package Training.Vektoren;

import OOP.IO;

import java.io.IOException;

public class Verdoppeln {

    public static void main(String[] args) throws IOException {


        System.out.println("Bitte geben Sie ein Array aus Kommazahlen ein. ");
        System.out.print("Wie viele Werte? ");
        int kz = IO.readInteger();
        double array[] = new double[kz];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Wert " + (i + 1) + " eingeben: ");
            array[i] = IO.readDouble();
        }

        System.out.println("Ursprüngliches Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println("\nVerdoppeltes Array:");
        for (int i = 0; i < array.length; i++) {
            double x2 = array[i] * 2;
            System.out.print(x2 + "\t");
        }

    }
}
