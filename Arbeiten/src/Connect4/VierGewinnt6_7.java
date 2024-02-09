package Connect4;

import OOP.IO;

import java.io.IOException;
import java.sql.SQLOutput;

public class VierGewinnt6_7 {
    public static void main(String[] args) throws IOException {

        boolean gewinnen = false;
        initialiesierungGameboard();
        do {
            System.out.println("----------Connect 4----------\n");
            anzeigeGameboard();
            System.out.print("Wähle eine Spalte: ");
            makeMove();
            gewinnen = checkWin();
        } while (!gewinnen);
        anzeigeGameboard();
        System.out.println("Spieler " + derzeitigerSpieler + " hat gewonnen!");
    }


    private static char[][] gameboard = new char[6][7];
    private static char derzeitigerSpieler = 'X';

    //Initialsierung
    private static void initialiesierungGameboard(){
        for (int zeile = 0; zeile < 6; zeile++) {
            for (int spalte = 0; spalte < 7; spalte++) {
                gameboard[zeile][spalte] = 'O';
            }
        }
    }

    //Anzeige
    private static void anzeigeGameboard(){
        for (int zeile = 0  ; zeile <= 6; zeile++) {
            System.out.print(zeile + "\t");
        }
        System.out.println();
        for (int zeile = 0; zeile < 6; zeile++) {
            for (int spalte = 0; spalte < 7; spalte++) {
                System.out.print(gameboard[zeile][spalte] + "\t");
            }
            System.out.println(zeile + 1 );
        }
    }

    //SpielerSwitch
    private static char spielerSwitch() {
        if (derzeitigerSpieler == 'X') {
            derzeitigerSpieler = 'Y';
        } else {
            derzeitigerSpieler = 'X';
        }
        return derzeitigerSpieler;
    }

    //Move
    private static void makeMove() throws IOException {
        int move = IO.readInteger();
        // 5 because it's the last number of our array and -- because it goes from 5 to 4 and so on
        for (int i = 5; i >= 0; i--) {
            if (gameboard[i][move] != 'O') {
                // it checks if the space is not free
            } else {
                gameboard[i][move] = spielerSwitch();
                return;
            }
        }
    }


    private static boolean checkWin() {
        //Horizontal
        for (int zeile = 0; zeile < gameboard.length; zeile++) {
            for (int spalte = 0; spalte <= gameboard[0].length - 3; spalte++) {
                // -3 because we only need 4 blocks to win
                if (gameboard[zeile][spalte] == derzeitigerSpieler &&
                        gameboard[zeile][spalte + 1] == derzeitigerSpieler &&
                        gameboard[zeile][spalte + 2] == derzeitigerSpieler &&
                        gameboard[zeile][spalte + 3] == derzeitigerSpieler) {
                    return true;
                }
            }
        }

        //Vertikal
        for (int zeile = 0; zeile < gameboard.length - 3; zeile++) {
            for (int spalte = 0; spalte < gameboard[0].length ; spalte++) {
                if (gameboard[zeile][spalte] == derzeitigerSpieler &&
                        gameboard[zeile + 1][spalte] == derzeitigerSpieler &&
                        gameboard[zeile + 2][spalte] == derzeitigerSpieler &&
                        gameboard[zeile + 3][spalte] == derzeitigerSpieler) {
                    return true;
                }
            }
        }

        //Diagonal von Links oben nach Rechts unten
        for (int zeile = 0; zeile < gameboard.length - 3; zeile++) {
            for (int spalte = 0; spalte < gameboard[0].length; spalte++) {
                if (gameboard[zeile][spalte] == derzeitigerSpieler &&
                        gameboard[zeile + 1][spalte + 1] == derzeitigerSpieler &&
                        gameboard[zeile + 2][spalte + 2] == derzeitigerSpieler &&
                        gameboard[zeile + 3][spalte + 3] == derzeitigerSpieler) {
                    return true;
                }
            }
        }


        //Diagonal von Rechts oben nach Links unten
        for (int zeile = 0; zeile < gameboard.length - 3; zeile++) {
            for (int spalte = 3; spalte < gameboard[0].length; spalte++) {
                if (gameboard[zeile][spalte] == derzeitigerSpieler &&
                        gameboard[zeile + 1][spalte - 1] == derzeitigerSpieler &&
                        gameboard[zeile + 2][spalte - 2] == derzeitigerSpieler &&
                        gameboard[zeile + 3][spalte - 3] == derzeitigerSpieler) {
                    return true;
                }
            }
        }
        return false;
    }

    //Weiter Spielen
    private static boolean wiederSpeilen() throws IOException {
        System.out.print("Möchtest du weider speilen? (ja/nein): ");
        String antwort = IO.readString();
        return antwort == ("ja");
    }
}