package lt.bit.oop.day4;

public class GreenTicket {
    public static void main(String[] args) {
        System.out.println(greenTicket(1, 2, 3));
        System.out.println(greenTicket(2, 2, 2));
        System.out.println(greenTicket(1, 1, 2));

    }
    private static int greenTicket (int a, int b, int c) {
        if (a == b && b == c) return 20;
        if (a == b || b == c || a == c) return 10;
        return 0;
    }
}
