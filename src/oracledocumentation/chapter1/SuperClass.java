package oracledocumentation.chapter1;

/**
 * This Program discuss About Inheriting variables from SuperClass to SubClass
 */
public class SuperClass {
    protected String name;
    protected int roll;

    SuperClass() {
        name = "Kahaiya";
        roll = 40;
    }

}

/**
 * In the Sub class we need not to declare the variable that are already
 * Declared in SuperClass
 * But Variables in Super Class must be protected
 */
class SubClass extends SuperClass {
    protected int rank;

    SubClass(String name, int roll, int rank) {
        this.name = name;
        this.roll = roll;
        this.rank = rank;
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass("Rehan", 34, 3);
        System.out.println(subClass.name);
        System.out.println(subClass.roll);
        System.out.println(subClass.rank);
    }
}
