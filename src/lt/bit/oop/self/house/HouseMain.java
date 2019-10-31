package lt.bit.oop.self.house;

public class HouseMain {
    public static void main(String[] args) {
        House Baltasis = new House();
        Baltasis.elevation = 5;
        Baltasis.yearBuilding = 2014;
        Baltasis.name = "Baltasis";
        Baltasis.outPut();

        House Zaliasis = new House();
        Zaliasis.elevation = 7;
        Zaliasis.yearBuilding = 2004;
        Zaliasis.name = "Zaliasis";
        Zaliasis.outPut();

        House Raudonas = new House ();
        Raudonas.elevation = 3;
        Raudonas.yearBuilding = 1960;
        Raudonas.name = "Raudonas";
        Raudonas.outPut();
    }
    }

