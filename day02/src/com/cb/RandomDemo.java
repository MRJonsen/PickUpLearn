package com.cb;

import java.util.Random;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/6/1
 * @Version 1.0
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random(10);

        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(random.nextInt(100));
        }

    }
}
