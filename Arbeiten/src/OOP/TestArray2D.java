package OOP;

import java.io.IOException;

public class TestArray2D {
    public static void main(String[] args) throws IOException {
        int[][] matrix = IO.readIntergerArray2D();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
