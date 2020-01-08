package lt.bit.oop.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exrc4 {
    public static void main(String[] args) {
        System.out.println(moreY(Arrays.asList("a", "b", "c")));
        System.out.println(moreY(Arrays.asList("hello", "there")));
        System.out.println(moreY(Arrays.asList("yay")));

    }

    private static List<String> moreY(List<String> strings) {
        final char y = 'y';
        List<String> newStrings = new ArrayList<>();
        for (String str : strings
        ) {
            newStrings.add(y + str + y);
        }
        return newStrings;
    }
}
