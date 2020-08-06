/*
 @author Dmitriy Futsur
 @since 07 Aug 2020
 @version 1.0.0
 Copyright (c) Dmitriy Futsur
 Description:
 Create tests for boolean operations
 */

package fuda.edu;

/**
 * Class to represent logic of boolean operations
 * @author Dmitriy Futsur
 * @version 1.0.0 07 Aug 2020
 */
public class BooleanOperations {

    /**
     * First param
     */
    public Boolean firstOne;

    /**
     * Second param
     */
    public Boolean secondOne;

    /**
     * Constructor
     */
    public BooleanOperations(Boolean firstOne, Boolean secondOne) {
        this.firstOne = firstOne;
        this.secondOne = secondOne;
    }

    /**
     * Method that implements conjunction operation
     */
    public Boolean conjunction() {
        return this.firstOne && this.secondOne;
    }

    /**
     * Method that implements disjunction operation
     */
    public Boolean disjunction() {
        return this.firstOne || this.secondOne;
    }
}
