package TrainingsLager;

import OOP.IO;

import java.io.IOException;

public class Alterspruefung {

    public static void main(String[] args) throws IOException {
        System.out.println("Wie Alt bist du?");

        int alter = IO.readInterger();
        if (alter < 18){
            System.out.println("Du bist noch minderjährig!");
        }else if (alter >= 18){
            System.out.println("Du bist schon volljährig!");
        }



    }
}
