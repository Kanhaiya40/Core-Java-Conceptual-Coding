public class ThreadGroupMaxPriorityRule {
    public static void main(String[] args) {
        ThreadGroup t1=new ThreadGroup("First");
        Thread t2=new Thread(t1,"Second");
        Thread t3=new Thread(t1,"Third");
        t1.setMaxPriority(3);
        Thread t4=new Thread(t1,"Fourth");
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        System.out.println(t3.getPriority());
    }


}
