package org.example;

public class App 
{
    public static void main( String[] args )
    {
        IntegerPalindrome integerPalindrome = new IntegerPalindrome();
        boolean result = integerPalindrome.isPalindrome(102); // enter an integer to check
        System.out.println(result);
    }
}
