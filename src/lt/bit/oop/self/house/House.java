package lt.bit.oop.self.house;

public class House {
    public int elevation;
    public int yearBuilding;
    public String name;
    int thisYear = 2019;

    public void outPut () {
        System.out.println("Namas " + name + ":");
        System.out.println("aukštų skaičius: " + elevation + ",");
        System.out.println("pastatymo metai: " + yearBuilding + ",");
        System.out.println("pastatui yra " + (thisYear - yearBuilding) + " metai.");
    }
}
