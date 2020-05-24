package array;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Random;

/**
 * Created by chenbin on 2018/9/20.
 */
public class Demo7_Exception {
    public static void main(String[] args) {
        int[] arr = new int[]{11,23,424,2121};
        showArr(arr);
        InputStream resourceAsStream = Demo7_Exception.class.getClassLoader().getResourceAsStream("db.properties");
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
            String url = properties.getProperty("url");
            String name = properties.getProperty("name");
            System.out.println(url+name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void showArr(int[] arr){
        for (int a:
             arr) {
            System.out.println(a);
        }
    }
}
