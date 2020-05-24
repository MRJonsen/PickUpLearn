
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/8/31
 * @Version 1.0
 */
public class SocketServer {
    static byte[] b = new byte[1024];

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8081);
            while (true) {
                Socket accept = serverSocket.accept();

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                        accept.getInputStream().read(b);
                        String string = new String(b);
                        System.out.println(string.trim());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                }).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
