package objects;

public class Square {
   private int side;
   private Point origin;

   public Square(Point origin, int side) {
      int p = origin.x;
      this.side = side;

      this.origin = origin;

   }

   public Square(int side) {
      this.side = side;
      this.origin = new Point();
   }

   public int getSide() {
      return this.side;
   }

   public int getArea() {
      return this.side * this.side;
   }

   public Point getOrigin() {
      return this.origin;
   }
}
