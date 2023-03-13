package Training.Other;

import OOP.IO;

import java.io.IOException;
import java.text.DecimalFormat;

public class Sparvertrag {

    public static void main(String[] args) throws IOException {

        DecimalFormat df = new DecimalFormat("#,##0.00 €"); //Genau 2 Dezimalstellen

        System.out.print("Bitte Kapital eingeben: ");
        double kapital = IO.readDouble();

        System.out.print("Bitte den Zinssatz eingeben: ");
        double zinssatz = IO.readDouble();

        System.out.print("Bitte die Laufzeit in Jahren eingeben: ");
        double laufzeit = IO.readDouble();

        System.out.println();
        double zinsbetrag;
        double jahresendbetrag;

        System.out.println("Jahr" + "\t\tAnfangskapital" + "\t\tZinsbetrag" + "\t\tJahresendbetrag");
        for (int i = 1; i <= laufzeit; i++){
            zinsbetrag = zinssatz/100*kapital;
            jahresendbetrag = kapital + zinsbetrag;
            System.out.print(i);
            System.out.print("\t\t\t"+ df.format(Math.round(kapital*100.0)/100.0));
            System.out.print("\t\t\t"+ df.format(Math.round(zinsbetrag*100.0)/100.0));
            System.out.print("\t\t\t"+df.format(Math.round(jahresendbetrag*100.0)/100.0));
            kapital = jahresendbetrag;
            System.out.println();
        }
        System.out.println();
    }
}
