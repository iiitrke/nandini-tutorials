package objects;

public class Point {
  private  Integer x;
  private  Integer y;

  public Point(Integer x, Integer y) {
    this.x = x;
    this.y = y;

  }

  public Point() {
    this.x = 0;
    this.y = 0;
  }


  public Integer getX(){
    return this.x;
  }

  public Integer getY(){
    return this.y;
  }

}
