package TrainingsLager;

import OOP.IO;

import java.io.IOException;

public class Wurzel {

    public static void main(String[] args) throws IOException {

        System.out.print("Was is die erste Zahl:");
        int n1 = IO.readInterger();
        System.out.print("Was ist die letzte Zahl:");
        int n2 = IO.readInterger();

        for (int i = n1; i <= n2; i++){
            System.out.println(i + "\t" + "Wurzel: " + Math.sqrt(i));
        }

    }
}
