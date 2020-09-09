package by.andrey.twikssi.exer1jobwitharrays.service;

import java.util.Arrays;

public class LookupArrayService {

    public static int findMax(int[] array){
        if(array == null || array.length == 0){
            return 0;
        } else{
            Arrays.sort(array);
            return array[array.length - 1];
        }
    }

    public static int findMin(int[] array){
        if(array == null || array.length == 0){
            return 0;
        } else{
            Arrays.sort(array);
            return array[0];
        }
    }
}
