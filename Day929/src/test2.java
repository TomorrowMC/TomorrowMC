import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Yifei.Hu
 * @create 2021-09--12:22
 */
public class test2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.31.85", 8888);
        //获取socket中的输出流
        OutputStream os = socket.getOutputStream();
        //在输出流中写入要发送给服务端的数据
        os.write("我是一个努工作,还不粘人的老码农".getBytes());
        //获取socket中的输入流，用来接收服务器返回的数据
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        int len = 0;
        byte[] b = new byte[1024];
        while((len = is.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }
        socket.close();
    }

    }

