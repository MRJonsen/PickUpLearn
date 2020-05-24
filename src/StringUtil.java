/**
 * Created by chenbin on 2018/9/20.
 */
public class StringUtil {
    private static StringUtil ourInstance = new StringUtil();

    public static StringUtil getInstance() {
        return ourInstance;
    }

    private StringUtil() {
    }
}
