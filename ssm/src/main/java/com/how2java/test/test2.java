package com.how2java.test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/7/16ø
 * @Version 1.0
 */
public class test2
{
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            while (true){
                System.out.println("dengdai");
                Socket accept = serverSocket.accept();
                System.out.println("sss");
                OutputStream outputStream = accept.getOutputStream();
                outputStream.write("<ht?".getBytes());
                outputStream.flush();
                outputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void changeName(Son son){
        son.setName("s");
    }
}
