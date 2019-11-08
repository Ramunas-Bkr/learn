package lt.bit.oop.self2;

import java.text.DecimalFormat;
import java.util.Scanner;


public class PizzaStore {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
        int pizza;
        double pizzaPrice = 0;
        String name;
        String pizzaName = null;
        String toppingName = "neužsakyta";
        String drinkName = "neužsakyta";
        String delivery;
        int topping;
        int drink;
        double deliveryFee = 2.50;
        double drinkPrice = 0;
        double toppingPrice = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Koks jūsų vardas?");
        name = sc.nextLine();
        System.out.println("Labas " + name + ", kokios picos norėtumėt? \n1:Margarita = 8.99" +
                "\n2:Saliami = 10.99 \n3:Kumpio ir grybų = 11.99");
        pizza = Integer.parseInt(sc.nextLine());

        if (pizza == 1) {
            pizzaName = "Margarita";
            pizzaPrice = 8.99;
        }
        else if (pizza == 2) {
            pizzaName = "Saliami";
            pizzaPrice = 10.99;
        }
        else if (pizza == 3) {
            pizzaName = "Kumpio ir grybų";
            pizzaPrice = 11.99;
        }

        do
        {
            System.out.println("Kokio padažo norite? Pasirink 1  \n1) Česankinis = 1.29" +
                    "  \n2) Aštrus = 1.49  \n3) BBQ = 1.59" +
                    "  \n4) Mix = 1.79  \n5) Nenoriu padažo");
            topping = Integer.parseInt(sc.nextLine());

            if (topping == 1){
                toppingName = "Česnakinis";
                toppingPrice = 1.29;
            }
            else if (topping == 2) {
                toppingName = "Aštrus";
                toppingPrice = 1.49;
            }
            else if (topping == 3) {
                toppingName = "BBQ";
                toppingPrice = 1.79;
            }
            else if (topping == 4) {
                toppingName = "Mix";
                toppingPrice = 1.59;
            }}
            while (topping < 1);

        System.out.println("Pasirinkite gėrimą: \n1) Coca cola 0,5l = 1.99" +
                "  \n2) Alus 0,5l = 2.49  \n3) Mineralinis vanduo gazuotas 0,5l = 1.99" +
                "  \n4) Mineralinis vanduo natūralus 0,5l = 1.99  \n5) Nenoriu gėrimo");
        drink = Integer.parseInt(sc.nextLine());

        if (drink == 1){
            drinkName = "Coca cola";
            drinkPrice = 1.99;
        }
        else if (drink == 2) {
            drinkName = "Alus";
            drinkPrice = 2.49;
        }
        else if (drink == 3) {
            drinkName = "Mineralinis vanduo gazuotas";
            drinkPrice = 1.99;
        }
        else if (drink == 4) {
            drinkName = "Mineralinis vanduo natūralus";
            drinkPrice = 1.59;
        }

        double totalCost = pizzaPrice + toppingPrice + drinkPrice;
        double totalCostD = pizzaPrice + toppingPrice + drinkPrice + deliveryFee;

        System.out.println("Ar reikia picą pristatyti?\n Įveskite taip arba ne");
        delivery = sc.nextLine();

        if (delivery.equals("taip")) {
            System.out.println("Ačiū, "+ name + ", čia jūsų užsakymas:" +"\nPica: " + pizzaName + ": " + pizzaPrice +
                    "\nPadažas: "+ toppingName + ": " + toppingPrice +
                    "\nGėrimas: " + drinkName + ": " + drinkPrice +
                    "\nPristatymas 2.50 "
                    + "\nViso kaina  "+ df2.format(totalCostD));
        }

        if (delivery.equals("ne")) {
            System.out.println("Ačiū " + name + ", čia jūsų užsakymas:" +"\nPica: " + pizzaName + ": " + pizzaPrice +
                    "\nPadažas: " + toppingName + ": " + toppingPrice +
                    "\nGėrimas: " + drinkName + ": " + drinkPrice +
                    "\nViso kaina: "+ df2.format(totalCost));
        }

    }}