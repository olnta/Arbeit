package ExamsTwo;

import OOP.IO;

import java.io.IOException;

public class Zellwachstum {

    public static void main(String[] args) throws IOException {

        System.out.println("Wie viel Tage haben sie die Zellen untersucht?");
        int tag = IO.readInterger();
        System.out.println("Anzahl Tage:" + tag);

        System.out.println("\nTag         Zellmenge");

        for (int i= 0; i <= tag; i++){
            double x = 10 * Math.pow(3 , i);
            System.out.println(i +"\t\t\t" + x);

        }

    }
}
