package lt.bit.oop.self2;

import java.util.Arrays;

public class Mass1 {
    public static void main(String[] args) {
        int [] mass1 = new  int[] {41, 23, 57, 67, 68, 14};
        int max = 0;
        for ( int i = 0; i < mass1.length; i++) {
            if (mass1[i] > max)
            max = mass1[i];
        }
        System.out.println("Didziausias masyvo skaicius: " + max);
    }
}
