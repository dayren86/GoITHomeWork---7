package shape;

public abstract class Shape {
    private String nameFigure;

    //Figure center coordinates
    private double x,y,z;

    public Shape() {

    }

    public Shape(String nameFigure, double x, double y, double z){
        this.nameFigure = nameFigure;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public abstract double figureArea();

    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    public String getNameFigure() {
        return nameFigure;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }
}