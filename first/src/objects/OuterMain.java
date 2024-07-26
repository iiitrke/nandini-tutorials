package objects;

import objects.OuterClass.InnerClass.StaticNestedClass;

public class OuterMain {
public static void main(String[] args) {
    System.out.println("Inner class");
    OuterClass outerClass = new OuterClass();
    OuterClass.InnerClass innerClass = outerClass.new InnerClass();
    innerClass.accessMembers();

    System.out.println("Static class");
    StaticNestedClass staticNestedClass = new StaticNestedClass();
    staticNestedClass.accessMembers(outerClass);

    System.out.println("Top level Class");
    TopLevelClass topLevelClass = new TopLevelClass();
    topLevelClass.accessMembers(outerClass);

}
}
