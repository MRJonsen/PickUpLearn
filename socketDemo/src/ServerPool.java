import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/11/18
 * @Version 1.0
 */
public class ServerPool {
    private ExecutorService executorService;

    public ServerPool(int maxsize, int queuesize) {
        executorService =  new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), maxsize, 120l, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(queuesize));
    }

    public void excute(Runnable runnable){
        executorService.execute(runnable);
    }
}
