package Lesson01InterfacesAndAbstraction.Lab.pr01_shapes_drawing;

public class Rectangle implements Drawable {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Draw a rectangle with width " + width + " and height " + height);
    }
}
