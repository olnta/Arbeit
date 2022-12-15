package TrainingsLager;

import OOP.IO;

import java.io.IOException;

public class Quadratsummen {

    public static void main(String[] args) throws IOException {

        System.out.print("Geben Sie ein Nummer ein: ");
        int n = IO.readInterger();
        double summe = 0;

        for (int i = 0; i <= n; i++){
            summe = Math.pow(i,2) + summe;
        }
        System.out.println("Die Summe aller Quadratzahlen bis ihre Angabe ist: " + summe);
    }
}
