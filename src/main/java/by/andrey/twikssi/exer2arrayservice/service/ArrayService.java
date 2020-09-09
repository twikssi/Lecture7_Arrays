package by.andrey.twikssi.exer2arrayservice.service;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayService {

    private ArrayService() {
    }

    public static int[] create(int size){
        return new int[size];
    }

    public static void fillRandomly(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(0,100);
        }
    }
}
