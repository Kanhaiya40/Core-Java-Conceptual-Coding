public class PattenInLoops {
    public static void main(String[] args) {

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <8; j++) {

                if(i==1 && (j==3 || j==4 ))
                {
                    System.out.print(" ");
                }
                else if(i==2 && (j==2 || j==3 || j==4 || j==5))
                {
                    System.out.print(" ");
                }
                else if(i==3 && (j==1||j==2||j==3||j==4||j==5||j==6))
                {
                    System.out.print(" ");
                }

                else {

                    System.out.print("*");
                }

            }
            System.out.println(" ");
        }
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <8; j++) {
                if(i==2 && (j==3 || j==4 ))
                {
                    System.out.print(" ");
                }
                else if(i==1 && (j==2 || j==3 || j==4 || j==5))
                {
                    System.out.print(" ");
                }
                else if(i==0 && (j==1||j==2||j==3||j==4||j==5||j==6))
                {
                    System.out.print(" ");
                }

                else {

                    System.out.print("*");
                }

            }
            System.out.println(" ");
        }
    }
}
