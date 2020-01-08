package lt.bit.oop.self2.insert;

public class Main {
    public static void main(String[] args) {
        Plain boeing = new Plain();
        Plain airbus = new Plain();
        boeing.wing.setWeight(2481f);
        boeing.wing.getWeight();
        airbus.wing.setWeight(3518f);
        airbus.wing.getWeight();
    }
}
