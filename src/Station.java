import java.util.Observable;
import java.util.Observer;

/**
 * Created by chenbin on 2018/6/15.
 */
public class Station implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("change");
    }



}
