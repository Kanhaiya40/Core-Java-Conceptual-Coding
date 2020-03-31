

/*class ParentThread extends Thread{

 ParentThread(String name)
 {
  super(name);
 }
 protected static InheritableThreadLocal t2=new InheritableThreadLocal();
 @Override
 public void run()
 {
  System.out.println(Thread.currentThread().getName()+"...."+t2.get());
  t2.set("Parent value");
  System.out.println(Thread.currentThread().getName()+"...."+t2.get());
  ChildThread c=new ChildThread("This is Child Thread");
  c.start();


 }


}
class ChildThread extends Thread{
 ChildThread(String name)
 {
  super(name);
 }
 ThreadLocal t3=new ThreadLocal();
 @Override
 public void run()
 {
  System.out.println(Thread.currentThread().getName()+"..."+t3.get());
  t3.set("Pure Child Thread Value");
  System.out.println(Thread.currentThread().getName()+"..."+t3.get());
  System.out.println(Thread.currentThread().getName()+"..."+ParentThread.t2.get());
 }

}
class InheritableThreadLocal
{

  ParentThread p=new ParentThread("This is Parent Thread");
  p.start();



 }
}*/