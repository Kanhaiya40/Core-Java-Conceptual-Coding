public class ComparableInterface {
    public static void main(String[] args) {
        //Comparable Interface Contains Only one Method -public int compareTo(Object o)
        //If it returns Negetive then element should come before the Comparing Object
        //If it  returns Positive then element Should Come next to Comparble Object
        //If it return 0 then it means Both Elements amd Object are equal And Object will be Not Added to Set
        //String Classes and All Wrapper Classes by default implement Comparable Inetrface
        //Comparable Interface Follow Ascending Order Sorting
        //It is Also Known As by default natural Sorting
        String s1="Kanhaiya";
        System.out.println(s1.compareTo("Rohan"));
        System.out.println(s1.compareTo("Rohini"));
        System.out.println(s1.compareTo("Ananad"));
        System.out.println(s1.compareTo("Pintu"));
    }
}
