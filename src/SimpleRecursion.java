public class SimpleRecursion {

    public static void main(String[] args) {
        SimpleRecursion simpleRecursion = new SimpleRecursion();
        System.out.println(simpleRecursion.recurse(6));
    }

    int recurse(int n) {
        if (n == 0) {
            return 1;
        } else
            return n * recurse(n - 1);
    }
}
