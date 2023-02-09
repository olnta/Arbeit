package TrainingsLager;

import OOP.IO;

import java.io.IOException;

public class BMI {

    public static void main(String[] args) throws IOException {
        System.out.println("Wie viel wiegen Sie?");
        double gewicht = IO.readDouble();

        System.out.println("Wie größ sind Sie? Bitte in M angeben!");
        double groesse = IO.readDouble();

        System.out.println("Was ist Ihre Geschlecht");
        System.out.println("0 = Männlich");
        System.out.println("1 = Weiblich");
        int geschlecht = IO.readInteger();

        double bmi = gewicht / Math.pow(groesse, 2);


        if (geschlecht == 1){
            if (bmi < 19){
                System.out.println("Untergewicht");
            }else if (bmi < 24){
                System.out.println("Normalgewicht");
            }else if (bmi < 30){
                System.out.println("Übergewicht");
            }else if ( bmi < 40){
                System.out.println("Adipositas");
            }else if (bmi >= 40){
                System.out.println("Starke Adipositas");
            }

        }else if (geschlecht == 0){
            if (bmi < 20){
                System.out.println("Untergewicht");
            }else if (bmi < 25){
                System.out.println("Normalgewicht");
            }else if (bmi < 30){
                System.out.println("Übergewicht");
            }else if ( bmi < 40){
                System.out.println("Adipositas");
            }else if (bmi >= 40){
                System.out.println("Starke Adipositas");
            }
        }
    }
}
