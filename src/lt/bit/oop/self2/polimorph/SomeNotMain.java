package lt.bit.oop.self2.polimorph;

public class SomeNotMain extends SomeMain {
    private String name;

    public void askSomething () {
        System.out.println("Iveskite savo varda: ");
        name = this.input.nextLine();
        System.out.println("Jusu vardas: " + name);
    }
}
