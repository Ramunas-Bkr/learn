package lt.bit.oop.exercises;

//Given a list of strings,
//return a list where each string has all its "x" removed.
//noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
// noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
// noX(["x"]) → [""]


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exrc23 {
    public static void main(String[] args) {
        System.out.println(nox(Arrays.asList("ax", "bb", "cx")));
        System.out.println(nox(Arrays.asList("xxax", "xbxbx", "xxcx")));
        System.out.println(nox(Arrays.asList("x")));

    }

    private static List<String> nox(List<String> asList) {
    return asList.stream().map(s -> s.replace("x", "")).collect(Collectors.toList());
    }
}
