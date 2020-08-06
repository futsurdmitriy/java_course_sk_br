package fuda.edu;

import java.util.logging.Logger;

public class Rectangle {

    private static final Logger LOGGER = Logger.getLogger(Rectangle.class.getName());
    private double height,weight;

    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public Rectangle() {}

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getArea() {
        LOGGER.info("Method get area was called.");
        return this.getHeight() * this.getWeight();
    }

    public double getPerimeter() {
        return 2 * (this.getWeight() + this.getHeight());
    }
}
