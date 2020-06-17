package oracledocumentation.chapter2;

public class TwoWaysOfConcatenatingString {
    public static void main(String[] args) {
        String hi = "Hi, ";
        String mom = "mom.";
        System.out.println(hi.concat(mom)); // concat method of String Class
        System.out.println(hi + mom); // plus operator in println method of out object System class
    }
}
