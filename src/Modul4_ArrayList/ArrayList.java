package Modul4_ArrayList;

import java.util.Iterator;
import java.util.List;

public class ArrayList {

    static List<Integer> sayilar ;
    public static void main(String[] args) {
    sayilar = new java.util.ArrayList<>();


        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        sayilar.add(50);
        sayilar.add(60);
        sayilar.add(70);

        System.out.println(sayilar);

        System.out.println(sayilar.size());

        System.out.println(sayilar.get(5));
        System.out.println(sayilar.remove(2));

        System.out.println(sayilar.set(5, 65));

        System.out.println(sayilar);


        for (Integer each: sayilar
             ) {

            System.out.print(each+ 5 + " ");
        }

        Iterator it1 = sayilar.iterator();

        System.out.println(it1.hasNext());
        System.out.println(it1.next());

        System.out.println("===============");
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        int i = 0;
        while (i<sayilar.size()) {
            Integer number = sayilar.get(i);

            System.out.print(number + " ");

            i++;
        }



        add(10);

        for (Integer s: sayilar
             ) {
            System.out.println(sayilar);
        }

        fjern (1);

        for (Integer s: sayilar
        ) {
            System.out.println(sayilar);
        }

    }

    static void add(int number) {

        sayilar.add(1, number);
    }
    static void fjern (int number) {
        sayilar.remove(number);
    }
}
