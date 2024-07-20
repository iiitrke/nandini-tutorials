package objects;

public class Rectangle {
    private int height;
    private int width;
    private Point origin;

    public Rectangle(int height, int width) {

        this.height = height;
        this.width = width;
        this.origin = new Point();
    }

    public Rectangle(Point origin, int height, int width) {
        this.origin = origin;
        this.height = height;
        this.width = width;
    }

    public int getArea() {
        return this.height * this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public Point getOrigin() {
        return this.origin;
    }

}
