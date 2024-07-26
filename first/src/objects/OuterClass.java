package objects;

public class OuterClass {
 String outerField = " Outer field";
 static String staticOuterField = "static outer field";

  class InnerClass{
    void accessMembers(){
        System.out.println(outerField);
        System.out.println(staticOuterField);

    }
    static class StaticNestedClass{
        void accessMembers(OuterClass outer){
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }
  }
}
