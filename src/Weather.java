import java.util.Observable;
import java.util.Observer;

/**
 * Created by chenbin on 2018/6/15.
 */
public class Weather extends Observable {


    public void setChange(){
        setChanged();
    }
}
