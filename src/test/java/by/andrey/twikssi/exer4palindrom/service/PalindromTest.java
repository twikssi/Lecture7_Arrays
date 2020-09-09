package by.andrey.twikssi.exer4palindrom.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromTest {

    @Test
    public void getStringWithoutTrumAndDocks() {
        String text = "door, Door ,,, Same, ,turn,,,    ";

        String expected = "doordoorsameturn";
        String actual = Palindrom.getStringWithoutTrumAndDocksAndSpace(text);

        assertEquals(expected,actual);
    }

    @Test
    public void isPalindrome() {
        String text = "level, pop,level";

        boolean expected = true;
        boolean actual = Palindrom.isPalindrome(text);

        assertEquals(expected,actual);
    }

    @Test
    public void isPalindromeReturnFalse() {
        String text = "level, pop,level lol d";

        boolean expected = false;
        boolean actual = Palindrom.isPalindrome(text);

        assertEquals(expected,actual);
    }

    @Test
    public void isPalindromeWithAllSymbols() {
        String text = " , ,.? , , !,d       ???!    .     e,,,?,,?,-,,D   ,. , , , ";

        boolean expected = true;
        boolean actual = Palindrom.isPalindrome(text);

        assertEquals(expected,actual);
    }
}