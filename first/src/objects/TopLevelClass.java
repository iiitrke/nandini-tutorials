package objects;

public class TopLevelClass {
  public void accessMembers(OuterClass outer){
    System.out.println(outer.outerField);
    System.out.println(OuterClass.staticOuterField);
  }
}
