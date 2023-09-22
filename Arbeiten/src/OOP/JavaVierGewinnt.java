package OOP;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaVierGewinnt {
    public static void main(String[] args) {

        //Aufgabe 1)
        System.out.print("Die Zahlen im Array sind: ");
        int [] array = {5, 12, 8, 23, 17};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


        //Aufgabe 2) Summe
        double summe = array[0];
        for (int i = 1; i < array.length; i++) {
            summe += array[i];
        }

        System.out.println("\n\nDie Summe der Zahlen im Array beträgt: " + summe);


        //Aufgabe 3) Max
        double max = array[0];

        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }

        System.out.println("\n\nDas größte Element im Array ist: " + max);

        //Aufgabe 4)

        System.out.println("\n\nArray vor der Änderung: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int replacement = 42;
        System.out.println("\n\nArray nach der Änderung: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            array [2] = replacement;
        }

        //Audgabe 5)
        System.out.println("\n\nArray vor der Sortierung: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n\nArray nach der Sortierung: ");
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


        //Aufgabe 6)
        int zeilen = 6;
        int spalten = 7;
        String[][] board = new String[zeilen][spalten];
        char currentPlayer = 'X';

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "O";
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("--------Connect 4---------");
        System.out.println();


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
