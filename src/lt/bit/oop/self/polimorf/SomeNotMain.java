package lt.bit.oop.self.polimorf;

public class SomeNotMain extends SomeMain {
    private String name;

    public void askSomething () {
        System.out.println("Koks Jusu vardas?");
        name = this.input.nextLine();
        System.out.println("Labas " + name);
    }
}
