package objects;

public class Circle {
    private double radius;
    private Point origin;

    public Circle(double radius) {
        this.radius = radius;
        this.origin = new Point();
    }

    public Circle(Point origin, int radius) {
        int p = origin.x;
        this.origin = origin;
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return 3.14*this.radius*this.radius;
    }
    public Point getOrigin(){
        return this.origin;
    }

}
