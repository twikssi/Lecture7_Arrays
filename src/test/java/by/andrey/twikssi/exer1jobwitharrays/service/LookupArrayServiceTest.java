package by.andrey.twikssi.exer1jobwitharrays.service;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class LookupArrayServiceTest extends TestCase {
    int[] intArr;

    @Test
    public void testFindMaxValue() {
        this.intArr = new int[]{45, 3, 6, 22, 49, 9, 34, 5, 1, 6, 0, -50, 80};
        int expected = 80;
        int actual = LookupArrayService.findMax(intArr);

        assertEquals(expected,actual);
    }

    @Test
    public void testFindMaxReturnZero() {
        this.intArr = new int[0];
        int expected = 0;
        int actual = LookupArrayService.findMax(intArr);

        assertEquals(expected,actual);
    }

    @Test
    public void testFindMaxReturnNull() {
        int expected = 0;
        int actual = LookupArrayService.findMax(intArr);

        assertEquals(expected,actual);
    }


}