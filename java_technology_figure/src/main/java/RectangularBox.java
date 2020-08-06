/*
 * Class name :  RectangularBox
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

public class RectangularBox {

    /**
     * Length of rectangularBox
     */
    private int length;

    /**
     * Width of rectangularBox
     */
    private int width;

    /**
     * Height of rectangularBox
     */
    private int height;

    /**
     * Constructor
     */
    public RectangularBox() {
        this.setHeight(4);
        this.setWidth(6);
        this.setLength(5);
    }

    /**
     * Class constructor with parameters
     * @param length Length that will be set to rectangularBox object
     * @param width Width that will be set to rectangularBox object
     * @param height Height that will be set to rectangularBox object
     */
    public RectangularBox(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // 2. Getters/Setters.

    /**
     * Getter for rectangularBox length field
     * @return Returns length of rectangularBox object
     */
    public int getLength() {
        return length;
    }

    /**
     * Setter for rectangularBox length field
     * @param length Sets length of rectangularBox object
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Getter for rectangularBox width field
     * @return Returns width of rectangularBox object
     */
    public int getWidth() {
        return width;
    }

    /**
     * Setter for rectangularBox width field
     * @param width Sets width of rectangularBox object
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Getter for rectangularBox height field
     * @return Returns height of rectangularBox object
     */
    public int getHeight() {
        return height;
    }

    /**
     * Setter for rectangularBox height field
     * @param height Sets height of rectangularBox object
     */
    public void setHeight(int height) {
        this.height = height;
    }

    // 4. Override toString() method

    /**
     * Method to get formatted rectangularBox object
     * @return Returns info about rectangularBox object
     */
    @Override
    public String toString() {
        return "RectangularBox{" +
                " length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    /**
     * Method that checks if rectangle has all fields set.
     * If not return false.
     * @return Returns boolean value that depends on rectangularBox fields.
     */
    private boolean rectangleExists() {
        if (this.getHeight() == 0 ||
                this.getWidth() == 0 ||
                this.getLength() == 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Method that calculates squared diagonal length of rectangularBox.
     * You can see formula on
     * https://ru.wikipedia.org/wiki/Прямоугольный_параллелепипед
     * @return Returns calculated squared diagonal length of rectangularBox.
     */
    public double calculateSquaredDiagonalLengthOfRectangularBox() {
        if (this.rectangleExists()) {
            return  (Math.pow(getLength(), 2) +
                    Math.pow(getHeight(), 2) +
                    Math.pow(getWidth(), 2));
        } else {
            System.out.println("Rectangular box is empty. " +
                    "Squared diagonal length cannot be calculated.");
            return 0;
        }
    }

    /**
     * Method that calculates diagonal length of rectangularBox.
     * You can see formula on
     * https://ru.wikipedia.org/wiki/Прямоугольный_параллелепипед
     * @return Returns calculated diagonal length of rectangularBox.
     */
    public double calculateDiagonalLengthOfRectangularBox() {
        return Math.sqrt(this.calculateSquaredDiagonalLengthOfRectangularBox());
    }

    /**
     * Method that calculates surface area of rectangularBox.
     * You can see formula on
     * https://ru.wikipedia.org/wiki/Прямоугольный_параллелепипед
     * @return Returns calculated surface area of rectangularBox.
     */
    public int calculateSurfaceArea() {
        if (this.rectangleExists()) {
            return 2 * (getLength() * getWidth() +
                    getWidth() * getHeight() +
                    getLength() * getHeight());
        } else {
            System.out.println("Rectangular box is empty. " +
                    "Surface area cannot be calculated.");
            return 0;
        }
    }

    /**
     * Calculates the diagonal of surface of rectangularBox by Pythagorean
     * theorem. If the lengths of both a and b are known,
     * then c can be calculated as c = √( a*a + b*b ), where a = height and
     * b = length.
     * URL https://en.wikipedia.org/wiki/Pythagorean_theorem
     * @return Returns calculated diagonal length of a rectangularBox surface.
     */
    public double calculateDiagonalOfARectangleBoxSurface() {
        if (this.getHeight() != 0 && this.getLength() != 0) {
            return Math.sqrt(this.getHeight() * this.getLength());
        } else {
            System.out.println("Height and length of rectangle box is empty. " +
                    "Diagonal of surface cannot be calculated.");
            return 0;
        }
    }

    /**
     * Method that calculates volume of a rectangularBox.
     * @return Returns volume of rectangularBox.
     */
    public int calculateVolumeOfRectangularBox() {
        if (this.rectangleExists()) {
            return this.getLength() * this.getHeight() * this.getWidth();
        } else {
            System.out.println("Rectangular box is empty. " +
                    "Surface area cannot be calculated.");
            return 0;
        }
    }

}