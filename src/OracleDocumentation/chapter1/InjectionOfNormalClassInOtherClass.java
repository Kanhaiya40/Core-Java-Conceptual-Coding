package OracleDocumentation.chapter1;

/**
 * This Class Is Used as Refrence to instanciate object Of Normal Class
 */
public class InjectionOfNormalClassInOtherClass{

                private NormalClass lowerLeft;

                private NormalClass upperRight;

                InjectionOfNormalClassInOtherClass() {
                        lowerLeft = new NormalClass();
                        upperRight = new NormalClass();

                }

        public static void main(String[] args) {
                        /* Aafter Execution Of This Creted Object NormalClass two Object Will Created Automatically */
                InjectionOfNormalClassInOtherClass injectionOfNormalClassInOtherClass=new InjectionOfNormalClassInOtherClass();

        }

        }

