package lt.bit.oop.day4.interfeices;

public interface IShape {

    String HEAD = "--- Shapes ---"; // public static final - by default


    static void printHeadline() {
        System.out.println(HEAD);
    }

    default String getName() {
        return getClass().getSimpleName();
    }

    public abstract double getArea(); // public abstract - by default

    double getPerimeter();
}
