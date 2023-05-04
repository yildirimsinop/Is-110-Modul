package LageMethod;

import java.io.PrintStream;

public class methodVoid {
    public static void main(String[] args) {
        number(12, 17);
       int resultat = methodInteger.numberGanger(2,2,2);
        System.out.println(resultat);

        int endelig = resultGangerAdd(resultat, 10);
        System.out.println(endelig);
    }

    public static int resultGangerAdd (int resultat, int number) {
        return resultat + 10;
    }

    public static void number (int number1, int number2) {

        System.out.println(number1 + number2);
    }
}
