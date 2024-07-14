package practice;

public class Circle {

    int x;
    int y;
    public Circle(int xl, int yl){
          this.x=xl;
          this.y=yl;
    }

    public static void main(String[] args) {
        Circle c=new Circle(5, 5);
        System.out.println(c.x +" "+ c.y);
        moveCircle(c, 9, 7);
        System.out.println(c.x +" " + c.y);
    }

    public static void moveCircle(Circle circle, int x, int y){
     circle.x=x;
     circle.y=y;
     x=20;
     y=20;
    }

}
