package Connect4;
import OOP.IO;
import java.io.IOException;

public class five {

        private static char[][] spielfeld = new char[6][7];
        private static char derzeitigerSpieler = 'X';

        // Methode zur Initialisierung des Spielfelds
        private static void initializeBoard() {
            for (int row = 0; row < 6; row++) {
                for (int col = 0; col < 7; col++) {
                    spielfeld[row][col] = 'O';
                }
            }
        }


        // Methode zum Darstellen des Spielfelds auf der Konsole
        private static void printBoard() {
            System.out.println("  0 1 2 3 4 5 6");
            for (int row = 0; row < 6; row++) {
                System.out.print(row + " ");
                for (int col = 0; col < 7; col++) {
                    System.out.print(spielfeld[row][col] + " ");
                }
                System.out.println();
            }
        }

        private static void makeMove() throws IOException {
            System.out.print("Wähle eine Spalte: ");
            int move = IO.readInteger();
            for (int i = 5; i >= 0; i--) {
                if (spielfeld[i][move] != 'O') {
                } else {
                    spielfeld[i][move] = spielerSwitch();
                    return;
                }
            }
        }

        private static char spielerSwitch() {
            if (derzeitigerSpieler == 'X') {
                derzeitigerSpieler = 'Y';
            } else {
                derzeitigerSpieler = 'X';
            }
            return derzeitigerSpieler;
        }

        private static boolean checkWin() {
            //Horizontal
            for (int zeile = 0; zeile < spielfeld.length; zeile++) {
                for (int spalte = 0; spalte <= spielfeld[0].length - 4; spalte++) {
                    if (spielfeld[zeile][spalte] == derzeitigerSpieler &&
                            spielfeld[zeile][spalte + 1] == derzeitigerSpieler &&
                            spielfeld[zeile][spalte + 2] == derzeitigerSpieler &&
                            spielfeld[zeile][spalte + 3] == derzeitigerSpieler) {
                        return true;
                    }
                }
            }

            //Vertikal
            for (int zeile = 0; zeile < spielfeld.length - 3; zeile++) {
                for (int spalte = 0; spalte < spielfeld[0].length - 4; spalte++) {
                    if (spielfeld[zeile][spalte] == derzeitigerSpieler &&
                            spielfeld[zeile + 1][spalte] == derzeitigerSpieler &&
                            spielfeld[zeile + 2][spalte] == derzeitigerSpieler &&
                            spielfeld[zeile + 3][spalte] == derzeitigerSpieler) {
                        return true;
                    }
                }
            }

            //Diagonal von Links oben nach Rechts unten
            for (int zeile = 0; zeile < spielfeld.length - 3; zeile++) {
                for (int spalte = 0; spalte < spielfeld[0].length - 3; spalte++) {
                    if (spielfeld[zeile][spalte] == derzeitigerSpieler &&
                            spielfeld[zeile + 1][spalte + 1] == derzeitigerSpieler &&
                            spielfeld[zeile + 2][spalte + 2] == derzeitigerSpieler &&
                            spielfeld[zeile + 3][spalte + 3] == derzeitigerSpieler) {
                        return true;
                    }
                }
            }


            //Diagonal von Rechts oben nach Links unten
            for (int zeile = 0; zeile < spielfeld.length - 3; zeile++) {
                for (int spalte = 3; spalte < spielfeld[0].length - 3; spalte++) {
                    if (spielfeld[zeile][spalte] == derzeitigerSpieler &&
                            spielfeld[zeile + 1][spalte - 1] == derzeitigerSpieler &&
                            spielfeld[zeile + 2][spalte - 2] == derzeitigerSpieler &&
                            spielfeld[zeile + 3][spalte - 3] == derzeitigerSpieler) {
                        return true;
                    }
                }
            }
            return false;
        }


        public static void main(String[] args) throws IOException {
            boolean gewinnen = false;
            initializeBoard();
            do {
                printBoard();
                makeMove();
                gewinnen = checkWin();
            } while (!gewinnen);
            printBoard();
        }
    }
