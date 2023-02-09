package TrainingsLager.Vektoren;

import OOP.IO;
import com.sun.security.jgss.GSSUtil;

import java.io.IOException;

public class SuchenInArray {

    public static void main(String[] args) throws IOException {

        //double a[] = new double[5];
        //a = IO.readArrayDouble();

        System.out.println("Bitte geben Sie ein Array aus Kommazahlen ein. ");
        double array[] = new double[5];


        for ( int i = 0; i < array.length; i++){
            System.out.print("Wert " + (i + 1) + " eingeben: ");
            array[i] = IO.readDouble();
        }

        System.out.println("Nach welcher Zahl möchten sie suchen? ");
        double zahl = IO.readDouble();

        //double suchezahl = array[0];
        for (int i = 0; i < array.length; i++){

            if(zahl == array[i]){
                System.out.println("Treffer");
            } else{
                System.out.println("Niete");
            }
        }

    }

}
