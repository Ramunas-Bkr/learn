package lt.bit.oop.exercises;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string is replaced by 3 copies of the string
 * concatenated together.
 */
class Exrc19 {

    public static void main(String[] args) {
        System.out.println(copies3(List.of("a", "bb", "ccc")));// → ["aaa", "bbbbbb", "ccccccccc"]
        System.out.println(copies3(List.of("24", "a", "")));// → ["242424", "aaa", ""]
        System.out.println(copies3(List.of("hello", "there")));// → ["hellohellohello", "theretherethere"]
    }

    static List<String> copies3(List<String> strings) {
        return strings.stream().map(s -> s.repeat(3)).collect(Collectors.toList());
    }}