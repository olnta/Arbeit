package TrainingsLager;

import OOP.IO;

import java.io.IOException;

public class ModuloRest {

    public static void main(String[] args) throws IOException {
        System.out.print("Gib den Anfangsnummer ein: ");
        int anfang = IO.readInteger();

        System.out.print("Gib den Schlussnummer ein: ");
        int schulss = IO.readInteger();


        for(int i = anfang; i <= schulss; i = i + 2){
            //Modulo-Operation
            if((i % 2) == 0){
                System.out.println(i);
            }

        }
    }
}
