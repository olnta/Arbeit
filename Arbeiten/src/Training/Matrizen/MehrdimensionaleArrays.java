package Training.Matrizen;

public class MehrdimensionaleArrays {
    public static void main(String[] args) {


        double [] [] eins = {
                {2.3, 3.5, 4.3 },
                {6.4, 4.3, 34.2},
                {23.4, 2.2, 21.2}
        };

        System.out.println(eins[1][1] + "+" + eins[2][0]);


        String [] [] zwei = {
                {"Das" , "ist", "ja"},
                {"voll", "geilo", "mit"},
                {"den", "2D", "Arrays"}
        };

        System.out.println(zwei[2][2] + " " +  zwei[1][2] + " " + zwei[2][1]);


    }
}
