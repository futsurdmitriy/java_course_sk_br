/*
 @author Dmitriy Futsur
 @since 07 Aug 2020
 @version 1.0.0
 Copyright (c) Dmitriy Futsur
 Description:
 Create tests for boolean operations
 */

package fuda.edu;

import java.util.logging.Logger;

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
     * Logger to log method actions
     */
    private static final Logger LOGGER =
            Logger.getLogger(BooleanOperations.class.getName());

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
        LOGGER.info("Started conjunction operation");
        if (this.firstOne == null || this.secondOne == null) return null;
        return this.firstOne && this.secondOne;
    }

    /**
     * Method that implements disjunction operation
     */
    public Boolean disjunction() {
        LOGGER.info("Started disjunction operation");
        if (this.firstOne == null && this.secondOne == null) return null;
        if (this.firstOne == null) return secondOne;
        if (this.secondOne == null) return firstOne;
        return this.firstOne || this.secondOne;
    }
}
