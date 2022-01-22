package shape;

import behavior.Moveable;

public class Quad extends Shape implements Moveable {
    double sideQuad;

    public Quad() {

    }

    public Quad(String name, double sideQuad, double x, double y, double z) {
        setNameFigure(name);
        this.sideQuad = sideQuad;
        setX(x);
        setY(y);
        setZ(z);
    }

    @Override
    public double figureArea() {
        return sideQuad * sideQuad;
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

    public void setSideQuad(double sideQuad) {
        this.sideQuad = sideQuad;
    }

    public double getSideQuad() {
        return sideQuad;
    }
}
