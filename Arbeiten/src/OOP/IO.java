package OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

    /**
     * Liest einen Text von der Konsole.
     * @return Der eingelesene Text.
     * @throws IOException
     */

    public static String readString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eingabe = br.readLine();
        return eingabe;
    }


    public static int readInterger() throws IOException {
        while (true) {
            String eingabe = readString();
            try {
                int ganzzahl = Integer.parseInt(eingabe);
                return ganzzahl;

            }
            catch (NumberFormatException e) {
                System.out.print("Keine Ganzzahl! Bitte erneut versuchen: ");
            }
        }
    }

    public static double readDouble() throws IOException {
        while (true) {
            String eingabe = readString().replace(",",".");
            try {
                double kommazahl =Double.parseDouble(eingabe);
                return kommazahl;
            }
            catch (NumberFormatException e) {
                System.out.print("Keine Nachkommazahl! Bitte erneut versuchen: ");
            }
        }

    }


}

