package objects;

public class Triangle {
    private int height;
    private int base;
    private Point origin;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
        this.origin = new Point();
    }

    public Triangle(Point origin, int height, int base) {
        int p = origin.x;
        this.height = height;
        this.base = base;
        this.origin = origin;
    }

    public int getHeight() {
        return this.height;

    }

    public int getBase() {
        return this.base;

    }

    public int getArea() {
        return (this.base * this.height) / 2;
    }

    public Point getOrigin() {
        return this.origin;
    }
}
