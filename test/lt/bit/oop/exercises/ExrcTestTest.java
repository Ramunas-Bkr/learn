package lt.bit.oop.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExrcTestTest {

    @Test
    public void testExtraFront() {
//        String result = ExrcTest.extraFront(new String("Hello"));
//        String expected = "HeHeHe";

        assertEquals("HeHeHe", ExrcTest.extraFront(new String("Hello")));
        assertEquals("ababab", ExrcTest.extraFront(new String("ab")));
        assertEquals("HHH", ExrcTest.extraFront(new String("H")));
        assertEquals("", ExrcTest.extraFront(new String("")));
        assertEquals(null, ExrcTest.extraFront(null));
    }
}


//    @Test
//    public void testDoubling() {
//        int[] result = Exrc1.doubling(new int[]{1, 2, 3});
//        String actual = Arrays.toString(result);
//        String expected = Arrays.toString(new int[]{2, 4, 6});
//
//        assertEquals(expected, actual);
//    }