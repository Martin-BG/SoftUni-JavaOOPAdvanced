package Lesson01InterfacesAndAbstraction.Lab.pr01_shapes_drawing;

public class Circle implements Drawable {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw a circle with radius " + radius);
    }
}