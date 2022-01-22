package shape;

import behavior.Moveable;

public class Circle extends Shape implements Moveable {
    private double diameter;

    public Circle() {

    }

    public Circle(String name, double diameter, double x, double y, double z) {
        setNameFigure(name);
        this.diameter = diameter;
        setX(x);
        setY(y);
        setZ(z);
    }

    @Override
    public double figureArea() {
        return 3.14 * diameter;
    }

    @Override
    public void moveUp() {
        setX(getX() + 1);
        setY(getY() + 1);
        setZ(getZ() + 1);
    }

    @Override
    public void moveDown() {
        setX(getX() - 1);
        setY(getY() - 1);
        setZ(getZ() - 1);
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
