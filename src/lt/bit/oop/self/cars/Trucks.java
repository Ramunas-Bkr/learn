package lt.bit.oop.self.cars;

public class Trucks extends Cars {
    int numWhells = 12;
    int maxWeight = 6500;

    public void newWhells (int whell) {
        numWhells = whell;
        System.out.println("Sunkvezimis turi " + numWhells + " ratu");
    }

    public Trucks(int numWhells, int maxWeight) {
        this.numWhells = numWhells;
        this.maxWeight = maxWeight;
    }
}
