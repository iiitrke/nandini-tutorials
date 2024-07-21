package objects;

public class Rectangle {
    private Integer height;
    private Integer width;
    private Point origin;

    public Rectangle(Integer height, Integer width) {

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
