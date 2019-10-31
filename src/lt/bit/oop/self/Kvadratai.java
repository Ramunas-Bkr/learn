package lt.bit.oop.self;

import java.util.Arrays;

public class Kvadratai {
    public static void main(String[] args) {
        //Isvesti kvadratus skaiciu nuo 10 iki 20

        for (int i = 10; i<21; i++) {
            System.out.println(i + "kvadratas lygus " + i * i);
        }

        //Sudaryti masyva ir rasti jo didziausia reiksme

        int[] numbers = new int[] { 1, 17, 3, 5, 2, 6, 4, 9 };
        int max = 0;
        for ( int i = 0; i<numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Didziausias skaicius masyve: " + max);

        //Dvigubi masyvai
        int[][] dvigubas = { {1, 5, 7}, {4, 8, 9} };
        dvigubas [0][1] = 9; // pakeicia pirmo masyvo antra skaiciu (0 masyvas, 1 reiksme)
        System.out.println("Pakeistas dvigubas masyvas: " + Arrays.deepToString(dvigubas));
    }
}
