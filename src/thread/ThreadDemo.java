package thread;


/**
 * Created by chenbin on 2018/9/21.
 */
public class ThreadDemo extends Thread {

    public ThreadDemo() {

    }

    @Override
    public void run() {
        while (true) {

            try {
                System.out.println(Thread.currentThread().getId() + "-----------------------");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
