import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Yifei.Hu
 * @create 2021-09--12:22
 */
public class test3 {
    public static void main(String[] args) throws IOException {
        //创建一个服务器socket
        ServerSocket serverSocket = new ServerSocket(8888);
        //获取客户端的socket对象
        Socket accept = serverSocket.accept();
        //获取一个输入流对象（服务器端不会去创建输入输出流对象，它使用的是客户端自已的流对象，给客户端发送消息）
        InputStream is = accept.getInputStream();
        int len = 0;
        byte[] b = new byte[1024];
        System.out.println("接收到客户端发来的消息:");
        while((len = is.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }
        //显示出客户端发来的消息后，给客户端返回一个消息
        //获取输入流对象
        OutputStream os = accept.getOutputStream();
        os.write("服务器大王收到了你的消息,让你去寻山，快去吧".getBytes());
        accept.close();
        serverSocket.close();

    }
}
