import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegenEingabe {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Geben Sie die ersten Zahl ein:");
        String eingabe1 = bufferedReader.readLine().replace('.', ',');
        int zahl1 = Integer.parseInt(eingabe1);
        double zahl2 = Double.parseDouble(eingabe1);

        double ergebnis = zahl1 +zahl2;
        System.out.println(ergebnis);
    }
}
