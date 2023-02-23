package TrainingsLager.Vektoren;

public class Tonsignal {

    public static void main(String[] args) {

        int[] signal = {1, 5, 4, 5, 7, 6, 8, 6, 5, 4, 5, 4};
        int[] gegleattet = new int[signal.length];

        System.out.println("Ursprungssignal:");
        for (int i = 0; i < signal.length; i++) {
            System.out.print(signal[i] + " ");
        }

        gegleattet[0] = (signal[0] + signal[1]) / 2;
        gegleattet[gegleattet.length - 1] = (signal[signal.length - 2] + signal[signal.length - 1]) / 2;

        for (int i = 1; i < gegleattet.length - 1; i++) {
            gegleattet[i] = (signal[i - 1] + signal[i] + signal[i + 1]) / 3;
        }

        System.out.println("\nGeglättetes Signal:");
        for (int i = 0; i < gegleattet.length; i++) {
            System.out.print(gegleattet[i] + " ");
        }

    }
}
