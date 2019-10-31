package lt.bit.oop.self;
import java.util.Arrays;
import java.util.Scanner; //iskvieciam skaneri skaiciu suvedimui

public class Funkcijos {
    public static void main(String[] args) { //main reiskia, kad metodas negrazina nieko
        int temp = func (3, 4); // iskvieciam atskirai parasyta funkcija, kad 3 pakeltu 4 laipsniu
        System.out.println(temp);
        readArray();
//        System.out.println(Arrays.deepToString(arr));
    }

    public static int[] readArray () { //funkcija grazina int masyva []
        int [] arr;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        return arr;

    }

    public static int func(int a, int b) {  //parasyta funkcija atskirai
        int result = 1;
        for (int i = 0; i < b; i++)
            result *= a;
        return result; //funkcija grazina kintamaji result
    }
}
