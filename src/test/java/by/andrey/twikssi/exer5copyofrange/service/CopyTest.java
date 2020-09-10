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

    @Test
    public void copyInRange() {
        int[] checkArray = new int[]{4,5,2,7,8,9,0,3,1};

        int[] expected = new int[]{7,8,9};
        int[] actual = Copy.copyInRange(checkArray, 7,9);


        assertArrayEquals(expected, actual);
    }

    @Test
    public void copyInRangeWithRepeat() {
        int[] checkArray = new int[]{4,5,2,7,8,8,8,9,7,9,0,3,1};

        int[] expected = new int[]{7,7,8,8,8,9,9};
        int[] actual = Copy.copyInRange(checkArray, 7,9);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void copyInRangeWithOneElement() {
        int[] checkArray = new int[]{7};

        int[] expected = new int[]{7};
        int[] actual = Copy.copyInRange(checkArray, 7,9);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void copyInRangeWithNegative() {
        int[] checkArray = new int[]{4,7,9,-7,-6,-8};

        int[] expected = new int[]{-7,-6};
        int[] actual = Copy.copyInRange(checkArray, -7,-4);

        assertArrayEquals(expected, actual);
    }
}