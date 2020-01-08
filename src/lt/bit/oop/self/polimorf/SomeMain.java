package lt.bit.oop.self.polimorf;
import java.util.Scanner;

public class SomeMain {
    protected Scanner input = new Scanner(System.in);
    protected int age;

    public void askSomething () {
        age = input.nextInt();
    }
}
