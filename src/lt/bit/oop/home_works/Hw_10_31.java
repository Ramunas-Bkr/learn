package lt.bit.oop.home_works;

import java.util.*;
import java.util.stream.Collectors;

public class Hw_10_31 {
    public static void main(String[] args) {
        int[] needSorted = {-10, 0, 2, 9, -5};

        System.out.println("Masyvas prieš rūšiavimą: " + Arrays.toString(needSorted));
        Arrays.sort(needSorted);
        System.out.println("Masyvas didėja: " + Arrays.toString(needSorted));

        List<Integer> needSorted2 = Arrays.stream(needSorted).boxed().collect(Collectors.toList());
        System.out.println("Listas prieš rūšiavimą: " + needSorted2);
        Collections.sort(needSorted2, Collections.reverseOrder());
        System.out.println("Listas mažėja:" + needSorted2);

    }
}
