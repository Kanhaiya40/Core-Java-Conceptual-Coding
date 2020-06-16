package OracleDocumentation.chapter1;

public class NormalClass  {
                private double  x;    /*   declaring instance variable  */
                private double  y;    /*   declaring instance variable  */
                NormalClass() {        /* constructor to initialize to default zero value<  */
                        x = 0.0;
                        y = 0.0;
                }                  /* constructor to initialize to specific value  */
                NormalClass(double x, double y) {
                        this.x = x;    /* et instance variables to passed parameters  */

                        this.y = y;
                }

        public static void main(String[] args) {
                NormalClass normalClass; /* declares a variable to refer to a NormalClass object */
                normalClass=new NormalClass(); /* allocates an instance of  a NormalClass object */
                normalClass=new NormalClass(23.5,6.5); /* allocates an instance of  a NormalClass object with Specific Value */




        }


        }
