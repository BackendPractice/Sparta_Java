package Week_03.Instanceof;

// Main.java

class Parent { }  // Parent.java
class Child extends Parent { }  // Child.java

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();

        System.out.println(p instanceof Object);  // true
        System.out.println(p instanceof Parent);  // true
        System.out.println(p instanceof Child);  // false

        Parent c = new Child();

        System.out.println(c instanceof Object);  // true
        System.out.println(c instanceof Parent);  // true
        System.out.println(c instanceof Child);   // true
    }
}
