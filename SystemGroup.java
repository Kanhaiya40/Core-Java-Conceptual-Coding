public class SystemGroup {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
        System.out.println("|");
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println("|");
        ThreadGroup t1=new ThreadGroup("First");
        ThreadGroup t2=new ThreadGroup(t1,"Second");
        ThreadGroup t3=new ThreadGroup(t2,"Third");
        System.out.println(t1.getName());
        //System.out.println(t1.getParent().getName());
        System.out.println("|");
        System.out.println(t2.getName());
        //System.out.println(t2.getParent().getName());
        System.out.println("|");
        System.out.println(t3.getName());
       // System.out.println(t3.getParent().getName());
    }
}
