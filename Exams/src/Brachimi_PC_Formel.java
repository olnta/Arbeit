import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Brachimi_PC_Formel {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Gib ein Wert für p ein");
        String eingabe1 = br.readLine().replace(',','.');
        double p = Double.parseDouble(eingabe1);

        System.out.println("Gib ein Wert für q ein");
        String eingabe2 = br.readLine().replace(',','.');
        double q = Double.parseDouble(eingabe2);

        double x1 = -p/2 + Math.sqrt((Math.pow(p/2,2)) - q);
        double x2 = -p/2 - Math.sqrt((Math.pow(p/2,2)) - q);
        System.out.println("x1 ist : " + x1);
        System.out.println("x2 ist : " + x2);

    }

}
