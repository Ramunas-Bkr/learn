package lt.bit.oop.self.cars;

public class Cars {
    public int weight;
    public String model;
    public char color;
    public int speed;

    public void outPut () {
        System.out.println( "Automobilio " + model + " svoris yra: " + weight + "kg, maksimalus greitis: " + speed + "km/h, spalva: " + color);
    }

}
