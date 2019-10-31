package lt.bit.oop.exercises;

class Exrc2 {
    public static void main(String[] args) {
        int [] a = {5, 6, 10, 15, 8, 4};
        int [] b = {8, 5, 3};
        double vidurkisA = vidurkis(a);
        double vidurkisB = vidurkis(b);
        System.out.println(vidurkisA - vidurkisB);
    }
    static double  vidurkis(int[] arr ) {
        double sumaArr = 0;
        for (int i=0; i<arr.length; i++){
            sumaArr += arr[i];
        }
        return sumaArr / arr.length;
    }
}

