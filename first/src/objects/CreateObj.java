package objects;

public class CreateObj {

   public static void main(String[] args) {

      Point p = new Point(21, 56); /// AUTOBOXING - BOXING , UNBOXING

      
    
      Rectangle r1 = new Rectangle(new Point(22,22), 45, 56); 
      Rectangle r2 = new Rectangle(78, 100);
 
   Integer r1Area = r1.getArea();
   
      System.out.println(r1Area);
      System.out.println(r1Area);

      System.out.println(r1.getWidth());
      System.out.println(r1.getHeight());
      Point pr1 = r1.getOrigin();
      System.out.println(pr1.x + " " + pr1.y);

      r1=null;
      System.out.println(pr1.getX() + " " + pr1.getY());
      System.out.println(r1.getArea());


      System.out.println(r2.getArea());
      System.out.println(r2.getWidth());
      System.out.println(r2.getHeight());
      Point pr2 = r2.getOrigin();
      System.out.println(pr2.x + " " + pr2.y);

      Square s1 = new Square(4);
      Square s2 = null;
      try {
         s2 = new Square(p, 4);
         System.out.println(s1.getSide());
         System.out.println(s1.getArea());
         System.out.println(s2.getOrigin().x);

      } catch (NullPointerException e) {
         System.out.println("invalid origin");
         System.out.println(s2.getSide());
      }
      Circle c1 = new Circle(4);
      Circle c2 = new Circle(p, 5);

      System.out.println(c1.getRadius());
      System.out.println(c1.getArea());
      System.out.println(c2.getRadius());
      System.out.println(c2.getArea());

      try {
         Circle c3 = new Circle(null, 4);
         System.out.println(c3.getRadius());
         System.out.println(c3.getArea());
         System.out.println(c3.getOrigin().x);

      } catch (NullPointerException e) {
         System.out.println("invalid origin");
      }

   }

}
