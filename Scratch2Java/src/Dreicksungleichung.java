import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dreicksungleichung {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Gib den Zahl für die Seite a");
        String eingabeA = bufferedReader.readLine();
        double A = Double.parseDouble(eingabeA);

        System.out.println("Gib de Zahl für die Seite b");
        String eingabeB = bufferedReader.readLine();
        double B = Double.parseDouble(eingabeB);

        System.out.println("Gib den Zahl für die Seite c");
        String eingabeC = bufferedReader.readLine();
        double C = Double.parseDouble(eingabeC);

}
