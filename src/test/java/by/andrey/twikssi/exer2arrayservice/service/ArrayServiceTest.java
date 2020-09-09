package by.andrey.twikssi.exer2arrayservice.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayServiceTest {

    @Test
    public void create() {
       int[] expected = new int[6];
       int[] actual = ArrayService.create(6);

       assertArrayEquals(expected,actual);
    }
}