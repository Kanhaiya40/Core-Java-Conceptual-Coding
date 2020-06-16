package OracleDocumentation.chapter2;

/**
 * If we don't define a method that is declared in Transport interface The it will give
 * Class 'ImplementationClass' must either be declared abstract or implement abstract method 'restDay()' in 'Transport
 * Error
 * So we need To implement that class also
 */
public class ImplementationClass  extends Transportation implements Transport{

        ImplementationClass()
        {
            id=3;
            vehicle="BiCycle";
            noOfWheel=2;
        }
        @Override
        public void route() {
                System.out.println("Delhi-To-Bombay");
        }

        @Override
        public void timing() {
                System.out.println("6:00 am -To- 7:00 pm");
        }

        @Override
        public void restDay() {
                System.out.println("Sunday");
        }
}
