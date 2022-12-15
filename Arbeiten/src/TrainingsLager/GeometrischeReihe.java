package TrainingsLager;

import OOP.IO;

import java.io.IOException;

public class GeometrischeReihe {

    public static void main(String[] args) throws IOException {

        System.out.println("Geben sie ein Ganzzahl ein:");
        int n = IO.readInterger();
        double summe = 0;

        for (int i = 1; i <= n; i++){
            summe = summe + (1/(Math.pow(2,i)));
        }
        System.out.println(summe);

    }
}
