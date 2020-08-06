/*
 * Class name :  RectangularBoxTest
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0.0 07-Aug-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 *
 * Test methods of figure from first task
 *
 */

import org.junit.Test;

import static org.junit.Assert.*;

/*
 * Class to test RectangularBox logic
 * @author Dmitriy Futsur
 * @version 1.0.0 07-Aug-2020
* */
public class RectangularBoxTest {

    /**
     *  Field to store result of method execution
     */
    int result;

    @Test
    public void whenLength3Width5Height2AndVolume30() {
        assertEquals(30.0,
                result = new RectangularBox(3, 5, 2)
                        .calculateVolumeOfRectangularBox()
                , 0.01);
    }

    @Test
    public void whenLength3Width5Height2AndSurfaceArea62() {
        assertEquals(62.0,
                result = new RectangularBox(3, 5, 2)
                        .calculateSurfaceArea()
                , 0.01);
    }

    @Test
    public void whenLength3Width5Height2AndSquaredDiagonalLength38() {
        assertEquals(38.0,
                result = (int) new RectangularBox(3, 5, 2)
                        .calculateSquaredDiagonalLengthOfRectangularBox()
                , 0.01);
    }

    @Test
    public void whenLength3Width5Height2AndDiagonalLength6() {
        assertEquals(6.0,
                result = (int) new RectangularBox(3, 5, 2)
                        .calculateDiagonalLengthOfRectangularBox()
                , 0.01);
    }

}