package com.cb;

import java.util.Scanner;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/6/1
 * @Version 1.0
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()){
            System.out.println(scanner.next());
        }

    }
}
