package oracledocumentation.chapter2;

/**
 * This Program extract first Chacter Of words Of Your Name
 */
public class ExtractingIntialFromMyName {
    public static void main(String[] args) {
        String myName = "Kanhaiya Kumar Singh";
        StringBuffer myInitials = new StringBuffer();
        for (int i = 0; i < myName.length(); i++) {
            if (Character.isUpperCase(myName.charAt(i))) {
                myInitials.append(myName.charAt(i));
            }
        }
        System.out.println(myInitials);
    }
}
