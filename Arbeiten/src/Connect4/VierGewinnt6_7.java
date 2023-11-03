package Connect4;

import OOP.IO;

public class VierGewinnt6_7 {
    public static void main(String[] args) {

        //Aufgabe 6)
        int zeilen = 6;
        int spalten = 7;
        int zahl1 = 1;
        int zahl = 1;

        String[][] board = new String[zeilen][spalten];
        char currentPlayer = 'X';
        char nextPlayer = 'Y';

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "O";
            }
        }

        System.out.println();
        System.out.println("--------Connect 4---------");
        System.out.println();

        for (int i = 0; i < board.length + 1; i++) {
            System.out.print(zahl1++  + "\t");
        }

        System.out.println("");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println(zahl++);
        }

        for (int i = 5; i < board.length; i++){

        }

    }
    //============================================================

    public static void main(String[] args) {
        while (true) {
            Spalteneingabe();
            Spielzug();
            SpielFeldAusgeben();
            Gewinnbedingung();
            Spielerwechsel();
        }
    }
    static int[][] SpielFeld = new int[6][7]; // 6 Zeilen, 7 Spalten
    static int Zeilen = SpielFeld.length;
    static int Spalten = 7;

    static int[] spalteFuellstand = new int[7];

    static boolean SpielerEins = true;

    static int Spalte = 0;
    static int ZeilenCounter;
    static int SpaltenCounter;


    private static void SpielFeldAusgeben() {
        // Ausgabe des Spielfelds
        System.out.println("|   |   |   |   |   |   |   |");
        System.out.println("| 1 | 2 | 3 | 4 | 5 | 6 | 7 |");
        System.out.println("|___|___|___|___|___|___|___|");

        for (ZeilenCounter = 0; ZeilenCounter < Zeilen; ZeilenCounter++) {
            System.out.println("|   |   |   |   |   |   |   |");
            for (SpaltenCounter = 0; SpaltenCounter < Spalten; SpaltenCounter++) {
                if (SpielFeld[ZeilenCounter][SpaltenCounter] == 0) {
                    System.out.print("| " + " " + " ");
                } // end of if
                else if (SpielFeld[ZeilenCounter][SpaltenCounter] == 1) {
                    System.out.print("| " + "X" + " ");
                } // end of if-else
                else if (SpielFeld[ZeilenCounter][SpaltenCounter] == 2) {
                    System.out.print("| " + "O" + " ");
                } // end of if-else
            } // end of for

            System.out.print("|");
            System.out.println();
            System.out.println("|___|___|___|___|___|___|___|");
        } // end of for
        System.out.println();
    }
    // end of private static void SpielFeldAusgeben

    private static void Spielerwechsel() {
        // Spielerwechsel
        if (SpielerEins == true) {
            SpielerEins = false;
        } // end of if
        else {
            SpielerEins = true;
        } // end of if-else
    } // end of private static void Spielerwechsel

    private static void Spalteneingabe() {

        // Spalteneingabe durch Spieler eins oder zwei
        try {
            int Spieler;
            Spalte = 0;
            String EingabeA;

            if (SpielerEins == true) {
                System.out.println("Spieler 1: Bitte Spaltennummer angeben: ");
                EingabeA = IO.readString();
            } // end of if
            else {
                System.out.println("Spieler 2: Bitte Spaltennummer angeben: ");
                EingabeA = IO.readString();
            } // end of if-else
            // Prüfen der Eingabe auf einen Wert zwischen 1 und 7
            Spalte = Integer.parseInt(EingabeA);
        } catch (Exception ex) {
            //System.out.println("Bitte Zahl zwischen 1 und 7 eingeben");
        }

        if (Spalte < 1 || Spalte > 7) {
            System.out.println();
            System.out.println("Achtung! Die eingegebene Spaltennummer muss zwischen 1 und 7 liegen!");
            Spalteneingabe();
        } else if (spalteFuellstand[Spalte - 1] > 5) {
            System.out.println("Spalte voll!!!!");
            Spalteneingabe();
        } else {
            spalteFuellstand[Spalte - 1]++;
        }
    }

    private static void Spielzug() {

        if (SpielerEins == true) {
            SpielFeld[6 - spalteFuellstand[Spalte - 1]][Spalte - 1] = 1;
        } // end of if
        else {
            SpielFeld[6 - spalteFuellstand[Spalte - 1]][Spalte - 1] = 2;
        } // end of if-else
    }// end of private static void Spielzug

    private static void Gewinnbedingung() {
        boolean a = false;
        int s;
        if (SpielerEins == true) {
            s = 1;
        } else {
            s = 2;
        }
        //Horizontale Gewinnbedingung
        for (int i = 0; i <= 2; i++)
            for (int j = 0; j <= 6; j++) {
                if (SpielFeld[i][j] == s && SpielFeld[i + 1][j] == s && SpielFeld[i + 2][j] == s && SpielFeld[i + 3][j] == s) {
                    a = true;
                }
            }
        //Vertikale Gewinnbedingung
        for (int i = 0; i <= 5; i++)
            for (int j = 0; j <= 3; j++) {
                if (SpielFeld[i][j] == s && SpielFeld[i][j + 1] == s && SpielFeld[i][j + 2] == s && SpielFeld[i][j + 3] == s) {
                    a = true;
                }
            }
        //Diagonale Gewinnbedinung
        for (int i = 0; i <= 2; i++)
        {
            if (SpielFeld[i][i] == s && SpielFeld[i + 1][i + 1] == s && SpielFeld[i + 2][i + 2] == s && SpielFeld[i + 3][i + 3] == s) {
                a = true;
            }
        }
    }
}

}
