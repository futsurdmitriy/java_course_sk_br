/*
 * Class name :  Main
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
 * This is Main class
 * @author Dmitriy Futsur
 * @version 1.0.0 06-Aug-2020
 */
public class Main {

    /**
     * main method of Main class
     * @param args This is default param for main method
     */
    public static void main(String[] args) {

        // Call of static method isValid(...){...}
        System.out.println(PalindromeService.isValid("AbBa"));

    }
}
