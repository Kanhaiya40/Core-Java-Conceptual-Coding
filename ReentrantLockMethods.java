import java.util.concurrent.locks.*;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockMethods {
    public static void main(String[] args) {
        ReentrantLock r=new ReentrantLock();
        r.lock();
        r.lock();
        System.out.println(r.getHoldCount());
        System.out.println(r.isHeldByCurrentThread());
        System.out.println(r.getQueueLength());
        System.out.println(r.isLocked());
        System.out.println(r.isFair());
        System.out.println(r.hasQueuedThreads());
        r.unlock();
        System.out.println(r.getHoldCount());
        r.unlock();
        System.out.println(r.getHoldCount());
    }
}
