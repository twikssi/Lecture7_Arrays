package by.andrey.twikssi.exer1jobwitharrays.service;

import java.util.Arrays;

public class LookupArrayService {

    public static boolean checkArrayForNullAndNoArgs(int[] array){
        if(array == null || array.length == 0){
            return false;
        } else{
           return true;
        }
    }

    public static int findMax(int[] array){
        if(checkArrayForNullAndNoArgs(array)){
            Arrays.sort(array);
            return array[array.length - 1];
        } else{
            return 0;
        }
    }

    public static int findMin(int[] array){
        if(checkArrayForNullAndNoArgs(array)){
            Arrays.sort(array);
            return array[0];
        } else{
            return 0;
        }
    }

    public static int findIndexOfMax(int[] array){
        if (checkArrayForNullAndNoArgs(array)){
            int maxIndex = 0;
            for (int i = 0; i < array.length; i++){
                if (array[maxIndex] < array[i]){
                    maxIndex = i;
                }
            }
            return maxIndex;
        } else {
            return -1;
        }
    }


}
