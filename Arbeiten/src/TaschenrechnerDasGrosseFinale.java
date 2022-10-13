import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerDasGrosseFinale {
    public static void main(String[] args) throws IOException {
        System.out.println("Folgende Rechnoperationen stehen zur Auswahl:");
        System.out.println("[ + ] für Addition");
        System.out.println("[ - ] für Subtraktion");
        System.out.println("[ * ] für Multiplikation");
        System.out.println("[ / ] für Division");
        System.out.println("[ p ] für Potenzieren");
        System.out.println("[ w ] für Wurzelziehen");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Deine Auswahl : ");
        String auswahl = br.readLine();

        System.out.println("Bitte die Basis eingeben:" );
        String basis = br.readLine().replace(',', '.');
        double zahl1 = Double.parseDouble(basis);

        System.out.println("Bite den Exponenten eingeben: ");
        String exponenten = br.readLine().replace(',','.');
        double zahl2= Double.parseDouble(exponenten);


        if (auswahl.equals("+")) {
            double summe = zahl1 + zahl2;
            System.out.println(summe);


        }else if (auswahl.equals ("-")) {
            double differenz = zahl1 - zahl2;
            System.out.println(differenz);


        } else if (auswahl.equals ("*")) {
            double produkt = zahl1 * zahl2;
            System.out.println(produkt);;


        } else if (auswahl.equals("/")) {
            double quotient= zahl1 / zahl2;
            System.out.println(quotient);


        } else if (auswahl.equals ("p")){
            System.out.println(zahl1 + "  hoch  " + zahl2 + "  =  " + Math.pow(zahl1, zahl2) );


        } else if (auswahl.equals("w")){

            System.out.println(zahl1 + "  +  " + zahl2 + "  =  " + Math.sqrt(zahl1+zahl2));
        }

        System.out.println("Wollen Sie eine weitere Rechnung durchführen, dann geben Sie [ j ] ein.");
        String text = br.readLine();

        if (text.equals("j")){

        }

    }
}
