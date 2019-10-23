package lt.bit.oop.home_works;

import java.util.Arrays;

class Hw_10_22 {
    public static void main(String[] args) {
        int lng = 0;
        int suma = 0;
        for (int i=1; i<=100; i++ ) {
            if (i % 2 != 0) {
                suma = suma + i;
                lng += 1;
            if (lng == 5) break;
            }
        }
        System.out.println("Skaičių nuo 1 iki 100 " + lng + " mažiausių skaičių suma lygi: " + suma);

        lng = 0;
        suma = 0;
        for ( int i=100; i>0; i--) {
            suma = suma + i;
            lng += 1;
            if (lng == 3) break;
        }
        System.out.println("Skaičių nuo 1 iki 100 " + lng + " didžiausių skaičių suma lygi: " + suma);
    }
}
