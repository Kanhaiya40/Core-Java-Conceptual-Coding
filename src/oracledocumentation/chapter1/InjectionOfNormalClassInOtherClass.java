package oracledocumentation.chapter1;

/**
 * This Class Is Used as Refrence to instanciate object Of Normal Class
 */
public class InjectionOfNormalClassInOtherClass {
    NormalClass lowerLeft;
    NormalClass upperRight;

    InjectionOfNormalClassInOtherClass() {
        lowerLeft = new NormalClass();
        upperRight = new NormalClass();
    }

    public static void main(String[] args) {
        /* Aafter Execution Of This Creted Object NormalClass two Object Will Created Automatically */
        InjectionOfNormalClassInOtherClass injectionOfNormalClassInOtherClass = new InjectionOfNormalClassInOtherClass();
        injectionOfNormalClassInOtherClass.setDimension();
        injectionOfNormalClassInOtherClass.getDimension();
    }

    public void setDimension() {
        lowerLeft.setX(3.5);
        lowerLeft.setY(4.3);
        upperRight.setY(6.8);
        upperRight.setX(5.2);
    }

    public void getDimension(){
        System.out.println(lowerLeft.getX());
        System.out.println(lowerLeft.getY());
        System.out.println(upperRight.getX());
        System.out.println(upperRight.getY());
    }

}

