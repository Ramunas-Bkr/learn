package lt.bit.oop.exercises;

public class Exec3 {

    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars")); //→ "ls"
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));

    }

    private static String lastChars(String first, String second) {
        final char defaultChar = '@';
        char firstChar = defaultChar;
        if (first.length() != 0) {
            firstChar = first.charAt(0);
        }
        char lastChar = defaultChar;
        if (second.length() != 0) {
            lastChar = second.charAt(second.length() - 1);
        }
        return "" + firstChar + lastChar;
    }
}

