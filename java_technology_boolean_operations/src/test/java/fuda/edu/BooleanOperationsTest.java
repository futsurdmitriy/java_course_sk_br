/*
 @author Dmitriy Futsur
 @since 07 Aug 2020
 @version 1.0.0
 Copyright (c) Dmitriy Futsur
 Description:
 Create tests for boolean operations
 */

package fuda.edu;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Class to test BooleanOperations
 * @author Dmitriy Futsur
 * @version 1.0.0 07 Aug 2020
 */
public class BooleanOperationsTest {

    /**
     * Result of boolean operation
     */
    Boolean result;

    /* Conjunction
        true && true == true
        true && false == false
        true && null == null

        false && true == false
        false && false == false
        false && null == null

        null && true == null
        null && false == null
        null && null == null

       Disjunction
        true || true == true
        true || false == true
        true || null == true

        false || true == true
        false || false == false
        false || null == false

        null || true == true
        null || false == false
        null || null == null
    */

    // Conjunction

    @Test
    public void whenFirstTrueSecondTrueConjunctionTrue() {
        assertEquals(true,
                result = new BooleanOperations(true, true).conjunction()
        );
    }

    @Test
    public void whenFirstTrueSecondFalseConjunctionFalse() {
        assertEquals(false,
                result = new BooleanOperations(true, false).conjunction()
        );
    }

    @Test
    public void whenFirstTrueSecondNullConjunctionNull() {
        assertEquals(null,
                result = new BooleanOperations(true, null).conjunction()
        );
    }

    ////////////////////////////////////////////////////////////////////////////

    @Test
    public void whenFirstFalseSecondTrueConjunctionFalse() {
        assertEquals(false,
                result = new BooleanOperations(false, true).conjunction()
        );
    }

    @Test
    public void whenFirstFalseSecondFalseConjunctionFalse() {
        assertEquals(false,
                result = new BooleanOperations(false, false).conjunction()
        );
    }

    @Test
    public void whenFirstFalseSecondNullConjunctionNull() {
        assertEquals(null,
                result = new BooleanOperations(false, null).conjunction()
        );
    }

    ////////////////////////////////////////////////////////////////////////////

    @Test
    public void whenFirstNullSecondTrueConjunctionNull() {
        assertEquals(null,
                result = new BooleanOperations(null, true).conjunction()
        );
    }

    @Test
    public void whenFirstNullSecondFalseConjunctionNull() {
        assertEquals(null,
                result = new BooleanOperations(null, false).conjunction()
        );
    }

    @Test
    public void whenFirstNullSecondNullConjunctionNull() {
        assertEquals(null,
                result = new BooleanOperations(null, null).conjunction()
        );
    }

    // Disjunction

    @Test
    public void whenFirstTrueSecondTrueDisjunctionTrue() {
        assertEquals(true,
                result = new BooleanOperations(true, true).disjunction()
        );
    }

    @Test
    public void whenFirstTrueSecondFalseDisjunctionTrue() {
        assertEquals(true,
                result = new BooleanOperations(true, false).disjunction()
        );
    }

    @Test
    public void whenFirstTrueSecondNullDisjunctionTrue() {
        assertEquals(true,
                result = new BooleanOperations(true, null).disjunction()
        );
    }

    ////////////////////////////////////////////////////////////////////////////

    @Test
    public void whenFirstFalseSecondTrueDisjunctionTrue() {
        assertEquals(true,
                result = new BooleanOperations(false, true).disjunction()
        );
    }

    @Test
    public void whenFirstFalseSecondFalseDisjunctionFalse() {
        assertEquals(false,
                result = new BooleanOperations(false, false).disjunction()
        );
    }

    @Test
    public void whenFirstFalseSecondNullDisjunctionFalse() {
        assertEquals(false,
                result = new BooleanOperations(false, null).disjunction()
        );
    }

    ////////////////////////////////////////////////////////////////////////////

    @Test
    public void whenFirstNullSecondTrueDisjunctionTrue() {
        assertEquals(true,
                result = new BooleanOperations(null, true).disjunction()
        );
    }

    @Test
    public void whenFirstNullSecondFalseDisjunctionFalse() {
        assertEquals(false,
                result = new BooleanOperations(null, false).disjunction()
        );
    }

    @Test
    public void whenFirstNullSecondNullDisjunctionNull() {
        assertEquals(null,
                result = new BooleanOperations(null, null).disjunction()
        );
    }

}