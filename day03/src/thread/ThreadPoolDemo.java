package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 同步实现 两种方式 jvm的synchronize 另一种
 *
 * @author Jonsen
 * @Description: TODO
 * @date 2019/8/19
 * @Version 1.0
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService1 = Executors.newFixedThreadPool(3);
        Myrun myrun = new Myrun();
        executorService1.execute(myrun);
        executorService1.execute(myrun);
//        executorService1.execute(new Myrun());
//        executorService1.execute(new Myrun());
//        executorService1.execute(new Myrun());
//        executorService1.execute(new Myrun());
//        executorService1.execute(new Myrun());
//        executorService1.execute(new Myrun());
//        executorService1.shutdownNow();
//        executorService1.execute(new Myrun());
    }

    static class Myrun implements Runnable {

        @Override
        public void run() {
            synchronized (this) {
                for (int i = 0; i < 10; i++) {
                    System.out.print(Thread.currentThread().getId() + "," + i + "    ");
                }
                System.out.println();
            }

        }
    }

    static class Myrun2 implements Runnable {
        private Lock lock = new ReentrantLock();

        @Override
        public void run() {
            lock.lock();
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.print(Thread.currentThread().getId() + "," + i + "    ");
                }
            } catch (Exception e) {
                lock.unlock();  // 确保释放锁，从而避免发生死锁。
            }

            System.out.println();


        }
    }
}
