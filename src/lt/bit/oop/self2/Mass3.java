package lt.bit.oop.self2;
import java.util.Arrays;
import java.util.Scanner;

public class Mass3 {
    public static void main(String[] args) {
        float[] array;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Elementu masyve skaicius: ");
        n = in.nextInt();
        array = new float[n];
        int i = 0;
        do {
            System.out.println("Iveskite array[" + i + "] elementa");
            array[i] = in.nextFloat();
            i++;
        } while (i<n);
//        System.out.println("Naujas masyvas: " + Arrays.deepToString(array));

    }
}
