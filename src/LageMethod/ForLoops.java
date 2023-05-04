package LageMethod;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin:");
        int sayi = scanner.nextInt();

        int rakamlarToplami = rakamlariTopla(sayi);
        System.out.println("Girilen sayının rakamları toplamı: " + rakamlarToplami);
    }

    public static int rakamlariTopla(int sayi) {
        int toplam = 0;

        while (sayi > 0) {
            int rakam = sayi % 10; // Sayının son basamağını alır
            toplam += rakam; // Rakamı toplama ekler
            sayi = sayi / 10; // Sayının son basamağını atar
        }

        return toplam;
    }
}