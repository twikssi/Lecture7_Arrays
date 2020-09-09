package by.andrey.twikssi.exer2arrayservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayService {
    public static Logger logger = LoggerFactory.getLogger(ArrayService.class);

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

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            String arrayText = "Index array = " + i + " Value = " + array[i];
            logger.info(arrayText);
        }
    }
}
