package by.andrey.twikssi.exer2arrayservice.service;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayServiceTest {

    @Test
    public void create() {
       int[] expected = new int[6];
       int[] actual = ArrayService.create(6);

       assertArrayEquals(expected,actual);
    }

    @Test
    public void fillRandomlyReturnFalse() {
        int[] intAr = new int[]{34,3,2,0,5,6,7};
        int[] intAr2 = new int[]{34,3,2,0,5,6,7};

        ArrayService.fillRandomly(intAr);

        boolean expected = false;
        boolean actual = Arrays.equals(intAr,intAr2);

        assertEquals(expected,actual);
    }
}