package TrainingsLager.Schleifen;

import OOP.IO;

import java.io.IOException;

public class Fakultaet {

    public static void main(String[] args) throws IOException {

        System.out.print("Welche Fakultät soll ermittelt werden: ");
        int n = IO.readInteger();
        double faklutaet = 1;
        int i = 1;

        while (i <= n) {
            faklutaet = faklutaet * i;
            i++;
        }
        System.out.println("Die Fakultät von " + n + "beträgt " + faklutaet);

        //for (int i = 1; i <= n; i++ ){
        //     fakultaet = fakultaet * i;
        // }

    }
}
