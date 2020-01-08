package lt.bit.oop.Self2.functions11;
import java.util.Arrays;
import java.util.Scanner;

public class Functions11_1 {
    public static String lygybe (int a, int b) {
        if (a > b) return (" yra didesnis uz ");
        else if (a < b) return (" yra mazesnis uz ");
        else return (" yra lygus ");
    }

    public static void main(String[] args) {
        int a1, b1;
        Scanner in = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu");
        a1 = in.nextInt();
        System.out.println("Iveskite antra skaiciu");
        b1 = in.nextInt();
        System.out.println(a1 + lygybe(a1, b1) + b1);
    }
}
