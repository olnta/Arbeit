package OOP;

import java.io.IOException;

public class TestIO {

    public static void main(String[] args) throws IOException {
        do {
            System.out.println("Wie heißen Sie?");
            String name = IO.readString();
            System.out.println(name);

            System.out.println("Wie Alt sind Sie?");
            int gz = IO.readInteger();
            System.out.println(gz);

            System.out.println("Geben Sie ein Kommazahl ein.");
            double kz = IO.readDouble();
            System.out.println(kz);

            System.out.println("Soll das Programm erneut laufen?");
        }while(IO.readBoolean());
    }


}
