import shape.Circle;
import shape.Quad;

public class Start {
    public static void main(String[] args) {
        Quad quad = new Quad("Quad", 5, 3, 4,4);
        System.out.println(quad.getNameFigure());
        System.out.println(quad.figureArea());
        System.out.println(quad.getX() + " " + quad.getY() + " " + quad.getZ());
        quad.moveUp();
        System.out.println(quad.getX() + " " + quad.getY() + " " + quad.getZ());
        quad.moveUp();
        System.out.println(quad.getX() + " " + quad.getY() + " " + quad.getZ());

        Circle circle = new Circle("Circle", 54 , 5, 7, 4);
        circle.moveUp();


    }
}
