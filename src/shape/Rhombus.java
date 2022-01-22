package shape;

import behavior.Moveable;

public class Rhombus extends Shape implements Moveable{

     private double sideA;
     private double height;

     public Rhombus() {

     }

     public Rhombus(String name, double sideA, double height, double x, double y, double z) {
         setNameFigure(name);
         this.sideA = sideA;
         this.height = height;
         setX(x);
         setY(y);
         setZ(z);
     }

    @Override
    public double figureArea() {
        return sideA * height;
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

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
