/*
 * Class name :  PalindromeServiceTest
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0.0 06-Aug-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 *
 * 1) Implement static method isValid(...){...}
 * 2) Logic of method isValid(...){...} has to be encapsulated
 * 3) Implement logger and test for each method of class PalindromeService
 * 4) Implement cyrillic symbols check
 *
 */

package fuda.edu;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Class to test work of PalindromeService class
 * @author Dmitriy Futsur
 * @version 1.0.0 06-Aug-2020
 */
public class PalindromeServiceTest {

    @Test
    public void whenTextIsAlphabeticAndPalindrome() {
        assertEquals(true, PalindromeService
                .isValid("AbBa"));
    }

    @Test
    public void whenTextIsAlphabeticAndNotPalindrome() {
        assertEquals(false, PalindromeService
                .isValid("Some kind of text"));
    }

    @Test
    public void whenTextIsCyrillicAndPalindrome() {
        assertEquals(true, PalindromeService
                .isValid("Пилип"));
    }

    @Test
    public void whenTextIsCyrillicAndNotPalindrome() {
        assertEquals(false, PalindromeService
                .isValid("Розмова"));
    }

    @Test
    public void whenTextIsNull() {
        assertEquals(null, PalindromeService
                .isValid(null));
    }

    @Test
    public void whenTextIsNumber() {
        assertEquals(false, PalindromeService
                .isValid("1345123"));
    }

    @Test
    public void whenTextIsSymbol() {
        assertEquals(false, PalindromeService
                .isValid("!.`"));
    }

}