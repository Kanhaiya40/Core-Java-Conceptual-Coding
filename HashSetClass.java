import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet h1 = new HashSet(8, 0.75f);
        HashSet h2 = new HashSet(19);
        for (int i = 0; i < 15; i++) {
            h2.add(i);
        }
        for (int i = 0; i < 10; i++) {
            h1.add(i);
        }
        System.out.println(h1.add(8));
        System.out.println(h1);
        System.out.println(h2);
        for (int i = 0; i < 10; i++) {
            System.out.println(h1.hashCode());
        }


    }
}
