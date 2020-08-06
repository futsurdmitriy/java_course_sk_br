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

    /**
     *  Field for string to check
     */
    private String string;

    /**
     * Regular expression to remove all the symbols except
     * alphabetic and cyrillic symbols
     */
    private static final String regex = "[^a-zA-Zа-яА-Я]";

    /**
     * Getter for string to check
     * @return String type string
     */
    public String getString() {
        return string;
    }

    /**
     * Setter for string to check
     * @param string String to check
     */
    public void setString(String string) {
        this.string = string;
    }

    /**
     * Empty constructor
     */
    public PalindromeService() {
    }

    /**
     * Constructor with parameter
     * @param string String to check
     */
    public PalindromeService(String string) { this.string = string;}

    /**
     * Method to convert string to lower case
     */
    private void toLowerCase() {
        this.setString(this.string.toLowerCase());
    }

    /**
     * Method to get formatted string free from symbols and spaces
     */
    private void getCleanedString(){
        this.setString(this.string.replaceAll(regex, ""));
    }

    /**
     * Method to get reversed string to check
     * @return Returns reversed string
     */
    private String getReversed(){
        return new StringBuilder (string).reverse().toString();
    }

    /**
     * Static implementation to check whether string is palindrome or not
     * @param string String to check
     * @return Returns boolean true if string is palindrome false if not and
     * null if string is undefined
     */
    public static Boolean isValid(String string) {
        if (string == null) return null;
        PalindromeService palindromeService = new PalindromeService(string);
        palindromeService.toLowerCase();
        palindromeService.getCleanedString();
        if (palindromeService.getString().length() == 0) return false;
        return palindromeService.getString().equals(palindromeService.getReversed());
    }
}
