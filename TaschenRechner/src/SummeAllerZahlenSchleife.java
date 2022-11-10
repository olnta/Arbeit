import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummeAllerZahlenSchleife {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Gib eine Ganzzahl.");
        String eingabe = br.readLine();
        int gz = Integer.parseInt(eingabe);

        int summe = 0;
        for (int i = 0; i <= gz; i = i + 1 ) {
            System.out.println();
            summe = summe + i;
        System.out.println(summe);
    }

    }
}
/** int = i = 1;
 * while ( i <=9)
 * {
 *     i = i + 1;
 * }
 */