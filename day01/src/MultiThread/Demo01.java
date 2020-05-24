package MultiThread;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2020/1/13
 * @Version 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        new MyThread().start();
    }

    static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
