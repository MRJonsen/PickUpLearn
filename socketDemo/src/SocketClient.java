import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.ServerSocketChannel;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/8/31
 * @Version 1.0
 */
public class SocketClient {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Socket socket = new Socket();
                    try {
                        socket.connect(new InetSocketAddress(8081));
                        OutputStream outputStream = socket.getOutputStream();
                        outputStream.write(new String("").getBytes());
                        socket.shutdownOutput();
                        long l = System.currentTimeMillis();
                        InputStream inputStream = socket.getInputStream();
                        byte[] b = new byte[1024];
                        int read = inputStream.read(b);
                        System.out.println(b.toString());
                        System.out.println(System.currentTimeMillis() - l);
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
