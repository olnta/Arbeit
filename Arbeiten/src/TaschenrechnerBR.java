import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerBR {

    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Gibt deine erste Zahl ein:");
    String text = br.readLine();
    double zahl1 =Double.parseDouble(text);

    System.out.println("Gibt deine zweite Zahl ein:");
    text = br.readLine();
    double zahl2 =Double.parseDouble(text);

    double summe = zahl1 + zahl2;
    double differenz = zahl1 - zahl2;
    double produkt = zahl1 * zahl2;
    double quotient = zahl1 / zahl2;

        System.out.println("Die Summe ist:" + summe);
        System.out.println("Die Differenz ist:" + differenz);
        System.out.println("Der Produkt ist:" + produkt);
        System.out.println("Die Quotient ist:" + quotient);


    }
}
