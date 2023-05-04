package LageMethod;

import java.util.Scanner;

public class ScannerScan {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("venligsvent skriver en navn");

        String navn = scan.nextLine();

        System.out.println("Venligsvent skriver en etternavn");

        String etternavn = scan.next();

        String resultat = navnEtternavn(navn, etternavn);

        System.out.println(resultat);





    }


    public static String navnEtternavn (String navn, String etternavn) {
        String navnSist = navn.substring(0,1).toUpperCase();
        String etternavnSist = etternavn.substring(0,1).toUpperCase();

        return (navnSist + navn.substring(1) + " " + etternavnSist + etternavn.substring(1));

    }


}
