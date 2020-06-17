package oracledocumentation.chapter2;

/**
 * If we don't define a method that is declared in Transport interface The it will give
 * Class 'ImplementationClass' must either be declared abstract or implement abstract method 'restDay()' in 'Transport
 * Error
 * So we need To implement that class also
 */
public class ImplementationClass extends Transportation implements Transport {

    public static void main(String[] args) {
        ImplementationClass implementationClass = new ImplementationClass();
        implementationClass.setId(3);
        implementationClass.setVehicle("Safari");
        implementationClass.setNoOfWheel(4);
        System.out.println("Vehicle Id=" + implementationClass.getId());
        System.out.println("Vehicle Name=" + implementationClass.getVehicle());
        System.out.println("No Of Wheel in Vehicle=" + implementationClass.getNoOfWheel());
        implementationClass.route();
        implementationClass.timing();
        implementationClass.restDay();
    }

    @Override
    public void route() {
        System.out.println("Route=Delhi-To-Bombay");
    }  // Overring Method From Transport Interface

    @Override
    public void timing() {
        System.out.println("Timing=6:00 am -To- 7:00 pm");
    }  // Overring Method From Transport Interface

    @Override
    public void restDay() {
        System.out.println("RestDay=Sunday");
    }    // Overring Method From Transport Interface
}
