package by.andrey.twikssi.exer5copyofrange.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CopyTest {

    @Test
    public void createdArrayWithBounds() {
        int[] checkArray = new int[]{14,15,16,17,18,19,20};
        int[] arrraWithBounds = Copy.createdArrayWithBounds(14, 20);

        assertArrayEquals(checkArray,arrraWithBounds);
    }

    @Test
    public void createdArrayWithOneValue() {
        int[] checkArray = new int[]{14};
        int[] arrraWithBounds = Copy.createdArrayWithBounds(14, 14);

        assertArrayEquals(checkArray,arrraWithBounds);
    }

    @Test
    public void createdArrayWithOneValueNegativeBound() {
        int[] checkArray = new int[]{14};
        int[] arrraWithBounds = Copy.createdArrayWithBounds(14, 4);

        assertArrayEquals(checkArray,arrraWithBounds);
    }
}