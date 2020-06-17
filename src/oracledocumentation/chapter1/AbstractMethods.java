package oracledocumentation.chapter1;

/**
 * This is an Abstract Class Which Contain Both abstract as well as Concrete Methods
 */
public abstract class AbstractMethods {

    /* This is an Abstract Method */
    abstract public void makeCar(String name, int noOfWheel);

    /* This is an Concrete Method */
    public void makeBulding() {
        System.out.println("Building Builded");
    }
}

/**
 * This is implementation class of Abstract Class Where abstract method is defined
 */
class ImplementationClass extends AbstractMethods {
    public static void main(String[] args) {
        ImplementationClass implementationClass = new ImplementationClass();
        implementationClass.makeCar("R1", 2);
        implementationClass.makeBulding();
    }

    @Override
    public void makeCar(String name, int noOfWheel) {
        System.out.println("Car Name=" + name + "\tCar Wheel=" + noOfWheel);
    }
}
