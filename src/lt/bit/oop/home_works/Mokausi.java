package lt.bit.oop.home_works;

import java.util.Arrays;

public class Mokausi {

    public static void main(String[] args) {
        String str = "Mokausi programuoti Java programavimo kalba";
        char[] chars = str.toCharArray();
        char[] charsReversed = new char[chars.length];
        int lastIndex = chars.length - 1;
        for (int i = lastIndex, j = 0; i >=0; --i, j++) {
            charsReversed[j] = chars[i];
        }
        System.out.println(String.valueOf(charsReversed));
    }
}
