package MultiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2020/1/13
 * @Version 1.0
 */
public class Demo03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        FutureTask<String> stringFutureTask = new FutureTask<String>(myCallable);
        new Thread(stringFutureTask).start();
        String s = stringFutureTask.get();
        System.out.println(Thread.currentThread().getName()+s);
    }

    static class MyCallable implements Callable<String> {


        @Override
        public String call() throws Exception {
            System.out.println("ss");
            return Thread.currentThread().getName();
        }
    }
}
