package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
    IntegerPalindrome integerPalindrome = new IntegerPalindrome();

    @Test
    public void numb909IsAPalindrome() {
        assertEquals(true, integerPalindrome.isPalindrome(909));
    }

    @Test
    public void isItWorkingWithSingleNumber() {
        assertEquals(true, integerPalindrome.isPalindrome(3));
    }

    @Test
    public void Numb523IsNotAPalindrome() {
        assertNotEquals(true, integerPalindrome.isPalindrome(523));
    }

    @Test
    public void checkThatNotATruePalindromeReturnsFalse() {
        assertNotEquals(false, integerPalindrome.isPalindrome(797));
    }


}
