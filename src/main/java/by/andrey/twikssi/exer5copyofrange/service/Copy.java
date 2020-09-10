package by.andrey.twikssi.exer5copyofrange.service;

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
}
