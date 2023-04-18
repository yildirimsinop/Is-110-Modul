package Modul14_Demonstere;

import java.util.Scanner;

public class Exeption {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv inn et delbart heltall");

        int number1 = scan.nextInt();

        System.out.println("Angi et heltall som skal deles");

        int number2 = scan.nextInt();

        try {
            System.out.println("Resultat : " + number1/number2);
        } catch (ArithmeticException e) {
            System.out.println("Skriv inn et annet tall enn null");
            e.printStackTrace();
        }

        System.out.println("Ha en fin dag");
    }
}
