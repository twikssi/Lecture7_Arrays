package by.andrey.twikssi.exer4palindrom.service;

public class Palindrom {

    private Palindrom() {
    }

    public static String getStringWithoutTrumAndDocksAndSpace(String text){
        return text.
                trim().
                replaceAll(",","").
                replaceAll(" ","").
                replaceAll("!","").
                replaceAll("-","").
                replaceAll(".","").
                replaceAll("\\?","").
                toLowerCase();
    }

    public static boolean isPalindrome(String text){
        String inputText = getStringWithoutTrumAndDocksAndSpace(text);
        String[] arrayString = inputText.split("");
        String reverseText = "";
        for (int i = arrayString.length - 1; i >= 0; i--){
            reverseText += arrayString[i];
        }
        if (reverseText.equals(inputText)){
            return true;
        }
        return false;
    }

}
