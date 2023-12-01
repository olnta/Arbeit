package Training.Verzweigungen;

import OOP.IO;

import java.io.IOException;

public class Benzinverbrauch {

    public static void main(String[] args) throws IOException {

        do {
            System.out.println("Wie viele Kilometer haben Sie gefahren?");
            double kilometer = IO.readDouble();


            if (kilometer < 0) {
                System.out.println("Falsche Eingabe! Möchten Sie nochmal versuchen? J oder N?");
            } else if (kilometer == 0) {
                System.out.println("Sie haben nicht gefahren! Möchten Sie nochmal versuchen? J oder N?");
            } else {
                System.out.println("Wie viele Kraftstoffes in Liter haben Sie verbraucht?");
                double kraftstoffeinLiter = IO.readDouble();
                double durchschnittsverbrauch = 100 * (kraftstoffeinLiter / kilometer);
                System.out.println("Der Durchschnittververbraucht ist :" + durchschnittsverbrauch);
                System.out.println("Möchten sie weiter machen?");
            }
        } while (IO.readBoolean());

    }

}
