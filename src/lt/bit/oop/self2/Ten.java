package lt.bit.oop.self2;
import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        int userNumber;
        Scanner getNumbers = new Scanner(System.in);
        do {
            System.out.println("Iveskite skaiciu 10: ");
            userNumber = getNumbers.nextInt();
        } while (userNumber != 10);
        System.out.println("Pagaliau Jus taip padarete!");
    }

}
