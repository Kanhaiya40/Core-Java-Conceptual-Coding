package oracledocumentation.chapter1;

/**
 * This class contains only synchronized methods
 */
public class MultithreadingDemoWithSynchronizedMethod {
    public synchronized void wish() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Playing");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            System.out.println("BBC News");
        }
    }

    public synchronized void play() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Plying");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            System.out.println("BBA News");
        }
    }
}

/**
 * This class defines the thread
 */
class ThreadExtendedClass extends Thread {
    // This is refrence variable of class which contain synchrinized methods
    MultithreadingDemoWithSynchronizedMethod multithreadingDemoWithSynchronizedMethod;
    // Passing that reference to current class contructor
    ThreadExtendedClass(MultithreadingDemoWithSynchronizedMethod multithreadingDemoWithSynchronizedMethod) {
        this.multithreadingDemoWithSynchronizedMethod = multithreadingDemoWithSynchronizedMethod;
    }

    @Override
    public void run() {
        /* JVM Don't know which method will be executed First
         * But if a Object get lock then after it's completion only
         * Other synchronized method will get the chance
         */
        multithreadingDemoWithSynchronizedMethod.play();
        multithreadingDemoWithSynchronizedMethod.wish();
    }
}

class StartingThread {
    public static void main(String[] args) {
        MultithreadingDemoWithSynchronizedMethod multithreadingDemoWithSynchronizedMethod = new MultithreadingDemoWithSynchronizedMethod();
        ThreadExtendedClass threadExtendedClass = new ThreadExtendedClass(multithreadingDemoWithSynchronizedMethod);
        threadExtendedClass.start();
    }
}
