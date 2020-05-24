package MultiThread;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2020/1/13
 * @Version 1.0
 */
public class Demo02 {
    public static void main(String[] args) {

    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }



}
