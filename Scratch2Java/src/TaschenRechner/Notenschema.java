package TaschenRechner;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Notenschema {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben Sie die erste Zahl ein");
        String Eingabe = bufferedReader.readLine();
        int Punkte = Integer.parseInt(Eingabe);
        int Note;

        if (Punkte < 27) {
            Note = 6;
        } else if (Punkte < 45) {
            Note = 5;
        } else if (Punkte < 59) {
            Note = 4;
        } else if (Punkte < 73) {
            Note = 3;
        } else if (Punkte < 85) {
            Note = 2;
        } else {
            Note = 1;
        }
        System.out.println("Ihre Note ist:" +Note);
    }
}
