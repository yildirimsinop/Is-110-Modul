package Modul4_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayForLoop {
    public static void main(String[] args) {

        List<Integer> sayilar =new ArrayList<>();


        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        sayilar.add(50);
        sayilar.add(60);
        sayilar.add(70);

        System.out.println(sayilar);

        for (int i = 0; i < sayilar.size(); i++) {

            System.out.println(sayilar.get(i) + " ");


        }

        int [] number = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(number));

        String [] frukt = new String[3];

        System.out.println(Arrays.toString(frukt));

        frukt [0] = "elma";
        frukt [1] = "armut";
        frukt [2] = "karpuz";

        System.out.println(Arrays.toString(frukt));


    }

}
