package lt.bit.oop.self.constructors;

public class Tree {
    int age;
    boolean live;
    String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, boolean live, String name) {
        this.age = age;
        this.live = live;
        this.name = name;
    }

    public Tree() {
        System.out.println("Tuscias konstruktorius, nera duomenu");
    }
    }
