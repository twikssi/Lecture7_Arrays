package by.andrey.twikssi.exer2arrayservice.service;

import by.andrey.twikssi.exer1jobwitharrays.service.LookupArrayService;
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

    @Test
    public void sum() {
        int[] intAr = new int[]{34,3,2,0,5,6,7};
        ArrayService.printArray(intAr);

        int expected = 57;
        int actual = ArrayService.sum(intAr);

        assertEquals(expected,actual);
    }

    @Test
    public void sumReturnZero() {
        int[] intAr = new int[0];

        int expected = 0;
        int actual = ArrayService.sum(intAr);

        assertEquals(expected,actual);
    }

    @Test
    public void avg() {
        int[] intAr = new int[]{34,3,2,0,5,6,7};

        double expected = 8.142;
        double actual = ArrayService.avg(intAr);

        assertEquals(expected,actual,0.00999999);
    }

    @Test
    public void avgReturnWholeNumber() {
        int[] intAr = new int[]{34,3,2,0,5,6,7,1,1,1};

        double expected = 6.0;
        double actual = ArrayService.avg(intAr);

        assertEquals(expected,actual,0.00999999);
    }

    @Test
    public void sortReturnTrue() {
        int[] intAr = new int[]{34,3,2,0,5,6,7,1,1,1};
        ArrayService.sort(intAr);

        boolean expected = true;
        boolean actual = (intAr[0] == 0 && intAr[9] == 34);

        assertEquals(expected,actual);
    }
}