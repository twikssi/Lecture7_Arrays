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


    @Test
    public void testFindMin() {
            this.intArr = new int[]{45, 3, 6, 22, 49, 9, 34, 5, 1, 6, 0, -50, 80};
            int expected = -50;
            int actual = LookupArrayService.findMin(intArr);

            assertEquals(expected,actual);
    }


    public void testFindIndexOfMax() {
        this.intArr = new int[]{45, 3, 6, 22, -49, 9, 34, 5, 1, 2, 0, 50, 80,45,4,0,8};
        int expected = 12;
        int actual = LookupArrayService.findIndexOfMax(intArr);

        assertEquals(expected,actual);
    }

    public void testFindIndexOfMaxReturnNegative(){
        this.intArr = new int[0];
        int expected = -1;
        int actual = LookupArrayService.findIndexOfMax(intArr);

        assertEquals(expected,actual);
    }

    public void testFindIndexOfMin() {
        this.intArr = new int[]{45, 3, 6, 22, -49, 9, 34, 5, 1, 2, 0, 50, 80,45,4,0,8};
        int expected = 4;
        int actual = LookupArrayService.findIndexOfMin(intArr);

        assertEquals(expected,actual);
    }

    public void testFindIndexOfMinReturnNegative(){
        this.intArr = new int[0];
        int expected = -1;
        int actual = LookupArrayService.findIndexOfMax(intArr);

        assertEquals(expected,actual);
    }

    public void testFindIndexOf() {
        this.intArr = new int[]{45, 3, 6, 22, -49, 9, 34, 5, 1, 2, 0, 50, 80,45,4,0,8};
        int expected = 2;
        int actual = LookupArrayService.findIndexOf(intArr,6);

        assertEquals(expected,actual);
    }

    public void testFindIndexOfReturnNegative() {
        this.intArr = new int[]{45, 3, 6, 22, -49, 9, 34, 5, 1, 2, 0, 50, 80,45,4,0,8};
        int expected = -1;
        int actual = LookupArrayService.findIndexOf(intArr,666);

        assertEquals(expected,actual);
    }
}