public class ThreadLocalClass {
    public static void main(String[] args) {
        ThreadLocal t1=new ThreadLocal();
        System.out.println(t1.get());
        t1.set("Kanhiaya");
        System.out.println(t1.get());
        t1.remove();
        System.out.println(t1.get());
    }


}
