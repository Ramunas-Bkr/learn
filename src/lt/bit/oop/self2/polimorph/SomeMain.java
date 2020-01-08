package lt.bit.oop.self2.polimorph;

//Sukurti pagrindine klase, i ja prideti:
//* metoda, gaunanti lankytojo amziu
//Sukurti paveldima klase. Prideti i jaL
//perrasyta metoda gauti vartotojo varda
//sukurti objekta klases-paveldetojos pagrindu ir panaudoti ja klases metodui

import java.util.Scanner;

    class SomeMain {
        protected Scanner input = new Scanner(System.in);
        protected int age;

        public void askSomething () {
            age = input.nextInt();
        }

}
