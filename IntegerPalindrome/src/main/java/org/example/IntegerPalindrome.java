package org.example;

public class IntegerPalindrome {

    public boolean isPalindrome(int numb) {
        StringBuilder reverse = new StringBuilder();
        for (int i = Integer.toString(numb).length() - 1; i >= 0; i--) {
            reverse.append(Integer.toString(numb).charAt(i));
        }
        return Integer.toString(numb).equals(reverse.toString());
    }
}

