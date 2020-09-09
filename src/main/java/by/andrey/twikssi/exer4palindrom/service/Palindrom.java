package by.andrey.twikssi.exer4palindrom.service;

public class Palindrom {

    private Palindrom() {
    }

    public static String getStringWithoutTrumAndDocksAndSpace(String text){
        String editText = text.
                trim().
                replaceAll(",","").
                replaceAll(" ","").
                replaceAll("!","").
                replaceAll("-","").
                replaceAll("\\.","").
                replaceAll("\\?","").
                toLowerCase();
        return editText;
    }

    public static boolean isPalindrome(String text){
        String inputText = getStringWithoutTrumAndDocksAndSpace(text);
        String[] arrayString = inputText.split("");
        String reverseText = "";
        for (int i = arrayString.length - 1; i >= 0; i--){
            reverseText += arrayString[i];
        }
        boolean isPal = false;
        if (reverseText.equals(inputText)){
            isPal = true;
        }
        return isPal;
    }

}
