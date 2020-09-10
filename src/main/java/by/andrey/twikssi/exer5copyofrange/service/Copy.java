package by.andrey.twikssi.exer5copyofrange.service;

import java.util.Arrays;

public class Copy {

    public static int[] createdArrayWithBounds (int leftBound, int rightBound){
        if ((rightBound - leftBound) > 0){
            int sizeArray = rightBound - leftBound + 1;
            int[] arrayWithBound = new int[sizeArray];
            arrayWithBound[0] = leftBound;
            for (int i = 1; i < sizeArray; i++){
                arrayWithBound[i] = arrayWithBound[i - 1] + 1;
            }
            return arrayWithBound;
        }
        return new int[]{leftBound};
    }

    public static int[] copyInRange(int[] in, int leftBound, int rightBound){
        int[] arrayWithBounds = createdArrayWithBounds(leftBound,rightBound);
        int[] copyArrayWithBounds = new int[in.length];
        int counter = 0;
        for (int j = 0; j < arrayWithBounds.length ; j++)
            for (int i = 0; i < in.length; i++){
                if (in[i] == arrayWithBounds[j]){
                    copyArrayWithBounds[counter] = in[i];
                    counter++;
                }
            }
        return Arrays.copyOfRange(copyArrayWithBounds,0,counter);
    }
}
