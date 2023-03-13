package Training.WachstumUndZellwachstum;

import OOP.IO;

import java.io.IOException;

public class Sternchen {
    public static void main(String[] args) throws IOException {
        System.out.println("Geben Sie ein den erste Nummer ein:");
        int zahl1 = IO.readInteger();

        System.out.println("Geben Sie den zweiten Nummer ein:");
        int zahl2 = IO.readInteger();

        System.out.println("1. Zahl: " + zahl1);
        System.out.println("2. Zahl: " + zahl2);


        for (int i = 1; i <= zahl1; i++) {
            System.out.println();

            for (int i1 = 1; i1 <= zahl2; i1++) {
                System.out.print("*");
            }
        }

        for (int i = 1; i <= zahl2; i++) {
            System.out.println();

            for (int i1 = 1; i1 <= zahl1; i1++) {
                System.out.print("*");
            }
        }
    }
}
