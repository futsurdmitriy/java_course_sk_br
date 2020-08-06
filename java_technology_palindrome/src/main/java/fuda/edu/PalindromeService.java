/*
 * Class name :  PalindromeService
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

/**
 * Class to process string and define whether it palindrome or not
 * @author Dmitriy Futsur
 * @version 1.0.0 06-Aug-2020
 */
public class PalindromeService {

    private String string;

    // regex to clean non alphabetic and non cyrillic symbols
    private static final String regex = "[^a-zA-Zа-яА-Я]";

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public PalindromeService() {
    }

    public PalindromeService(String string) { this.string = string;}

    private void toLowerCase() {
        this.setString(this.string.toLowerCase());
    }

    private void getCleanedString(){
        this.setString(this.string.replaceAll(regex, ""));
    }

    private String getReversed(){
        return new StringBuilder (string).reverse().toString();
    }

    public static Boolean isValid(String string) {
        if (string == null) return null;
        PalindromeService palindromeService = new PalindromeService(string);
        palindromeService.toLowerCase();
        palindromeService.getCleanedString();
        if (palindromeService.getString().length() == 0) return false;
        return palindromeService.getString().equals(palindromeService.getReversed());
    }
}
