package by.andrey.twikssi.exer1jobwitharrays.service;

import java.util.Arrays;

public class LookupArrayService {

    private LookupArrayService() {
    }

    public static boolean checkArrayForNullAndNoArgs(int[] array){
        boolean statement = true;
        if(array == null || array.length == 0){
            statement = false;
            return statement;
        }
        return statement;
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

    public static int findIndexOfMin(int[] array){
        if (checkArrayForNullAndNoArgs(array)){
            int maxIndex = 0;
            for (int i = 0; i < array.length; i++){
                if (array[maxIndex] > array[i]){
                    maxIndex = i;
                }
            }
            return maxIndex;
        } else {
            return -1;
        }
    }

    public static int findIndexOf(int[] array, int value){
        if (checkArrayForNullAndNoArgs(array)){
            for (int i = 0; i < array.length; i++){
                if (array[i] == value){
                   return i;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }


}
