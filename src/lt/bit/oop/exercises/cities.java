package lt.bit.oop.exercises;

public class cities {
    public static void main(String[] args) {
        String arr[] = {"Troškūnai", "Kazlų Rūda"};
        int n = arr.length;
        char coma = ',';

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + (i != n-1 ? coma : ""));
        }
    }
}
