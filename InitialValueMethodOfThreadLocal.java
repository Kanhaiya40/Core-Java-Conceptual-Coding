public class InitialValueMethodOfThreadLocal {
    public static void main(String[] args) {
        ThreadLocal t1=new ThreadLocal()
        {
            @Override
            protected Object initialValue() {
                return "Kanhaiya";
            }
        };
        System.out.println(t1.get());
        t1.set("Kanaha");
        System.out.println(t1.get());
        t1.remove();
        System.out.println(t1.get());
    }
}
