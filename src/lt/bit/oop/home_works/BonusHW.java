package lt.bit.oop.home_works;

import java.util.Arrays;

public class BonusHW {
    public static void main(String[] args) {
        int i;
        int j;
        int sum = 0;
        for (i=1, j=1; i<1001; i++, j++) {
            if (i >= j && i % j == 0) {
                sum = sum + j;
            }
            if (sum == i) {
                System.out.println("Idealus skaicius" + i);
            }
        }
    }
}
