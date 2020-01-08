package lt.bit.oop.self2;

public class NumbersColumn {
    public static void main(String[] args) {
        for (int i = 25; i <= 29; i++) {
            if (i == 27) continue;
            System.out.println(i);
        }

        int x = 25;
        do {
            x++;
            if (x == 27) continue;
            System.out.println(x);
        } while (x <= 29);
    }
}
