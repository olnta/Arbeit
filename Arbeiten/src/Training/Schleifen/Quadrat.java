package Training.Schleifen;

import OOP.IO;

import java.io.IOException;

public class Quadrat {

    public static void main(String[] args) throws IOException {

        System.out.print("Wie groß soll das Quadrat sein? ");
        int n = IO.readInteger();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }

        System.out.println("");

        for (int i = 1; i <= n; i++) {
            System.out.print("*");

            for (int i2 = 1; i2 <= n - 2; i2++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}
