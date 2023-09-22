package OOP;

public class VierGewinnt6_7 {
    public static void main(String[] args) {

        //Aufgabe 6)
        int zeilen = 6;
        int spalten = 7;
        int zahl1 = 1;
        int zahl = 1;

        String[][] board = new String[zeilen][spalten];
        char currentPlayer = 'X';

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
    }
}
