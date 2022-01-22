package shape;

import behavior.Moveable;

public class Rectangle extends Shape implements Moveable {
    private double sidaA, sideB;

    public Rectangle() {

    }

    public Rectangle(String name, double sidaA, double sideB, double x, double y, double z) {
        setNameFigure(name);
        this.sidaA = sidaA;
        this.sideB = sideB;
        setX(x);
        setY(y);
        setZ(z);
    }

    @Override
    public double figureArea() {
        return sidaA * sideB;
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

    public void setSidaA(double sidaA) {
        this.sidaA = sidaA;
    }

    public double getSidaA() {
        return sidaA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideB() {
        return sideB;
    }
}
