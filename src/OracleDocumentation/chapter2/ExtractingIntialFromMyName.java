package OracleDocumentation.chapter2;

public class ExtractingIntialFromMyName {
        public static void main(String[] args) {
                String myName="Kanhaiya Kumar Singh";
                StringBuffer myInitials=new StringBuffer();
                for (int i = 0; i <myName.length() ; i++) {
                        if (Character.isUpperCase(myName.charAt(i)))
                        {
                            myInitials.append(myName.charAt(i));
                        }
                }
                System.out.println(myInitials);
        }
}
