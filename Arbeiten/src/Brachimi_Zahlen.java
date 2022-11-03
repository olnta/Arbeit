import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Brachimi_Zahlen {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Gib eine Ganzzahl.");
        String eingabe = br.readLine();
        int gz = Integer.parseInt(eingabe);


        for (int i = 0; i <= gz; i = ++i ) {
            System.out.println(i);

        }

    }
}

