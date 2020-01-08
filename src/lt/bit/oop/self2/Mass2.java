package lt.bit.oop.self2;

public class Mass2 {
    public static void main(String[] args) {
        int [] mass2 = new int[] {14, -45, 12, -21, 23, -54, -5};
        int sum = 0;
        for (int i = 0; i<mass2.length; i++) {
            if (mass2[i] < 0)
                sum += mass2[i];
        }
        System.out.println("Neigiamu masyvo skaiciu suma lygi: " + sum);
        for (int i = 0; i < mass2.length; i++)
            System.out.println("Masyvo " + i + " elemento reiksme lygi " + mass2[i]);
    }
}
