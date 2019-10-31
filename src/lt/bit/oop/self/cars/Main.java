package lt.bit.oop.self.cars;

public class Main {
    public static void main(String[] args) {
        Cars Skoda = new Cars();
        Skoda.weight = 1300;
        Skoda.model = "Octavia";
        Skoda.color = 'W';
        Skoda.speed = 150;
        Skoda.outPut ();

        Cars Toyota = new Cars();
        Toyota.weight = 1500;
        Toyota.model = "Auris";
        Toyota.color = 'R';
        Toyota.speed = 160;
        Toyota.outPut ();

    }
}
