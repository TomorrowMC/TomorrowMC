import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author Yifei.Hu
 * @create 2021-09--16:07
 */
public class InterTest1 {
    @Test
    public void testInterTest1() throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("www.pornhub.com");
        System.out.println(byName);
    }

    //练习1：发送字符
    //客户端
    @Test
    public void clint1() throws IOException {//应该用trycatch的
        InetAddress byName = InetAddress.getByName("192.168.31.85");
        Socket socket = new Socket(byName, 20010);
        OutputStream out = socket.getOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(out);
        FileInputStream fileInputStream = new FileInputStream("1.jpg");
        // ObjectOutputStream objectInputStream = new ObjectInputStream(new FileInputStream("classTest.txt"));
        byte[] buffer = new byte[20];
        int len;
        while ((len = fileInputStream.read(buffer)) != -1) {
            bufferedOutputStream.write(buffer, 0, len);
            bufferedOutputStream.flush();
        }
        socket.shutdownOutput();
        //使用if判断一下是不是null
        bufferedOutputStream.close();
        socket.close();
        fileInputStream.close();
    }

    //服务端
    @Test
    public void server1() throws IOException {//应该用trycatch
        ServerSocket serverSocket = new ServerSocket(20010);
        InputStream in = serverSocket.accept().getInputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("2.jpg"));
        //  InputStreamReader inputStreamReader= new InputStreamReader(in);
        // ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        byte[] buffer = new byte[6];
        int len;
        while ((len = in.read(buffer)) != -1) {
            bufferedOutputStream.write(buffer, 0, len);
        }

        in.close();
        serverSocket.close();
        bufferedOutputStream.close();
        //byteArrayOutputStream.close();
    }
//练习二：传输数据

    @Test
    public void clint2() throws IOException {//应该用trycatch的
        InetAddress byName = InetAddress.getByName("192.168.31.85");
        Socket socket = new Socket(byName, 20029);
        OutputStream out = socket.getOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(out);
        bufferedOutputStream.write("good,你是一只猪\n,真的".getBytes());
        bufferedOutputStream.flush();
        socket.shutdownOutput();
        //使用if判断一下是不是null
        bufferedOutputStream.close();
        socket.close();

    }

    //服务端
    @Test
    public void server2() throws IOException {//应该用trycatch
        ServerSocket serverSocket = new ServerSocket(20029);
        InputStream in = serverSocket.accept().getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(in);
        // ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        char[] buffer = new char[6];
        int len;
        while ((len = inputStreamReader.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, len));
        }

        in.close();
        serverSocket.close();
        //byteArrayOutputStream.close();
    }

    //练习三：

    @Test
    public void clint3() throws IOException, InterruptedException {//应该用trycatch的
        InetAddress byName = InetAddress.getByName("192.168.31.85");
        Socket socket = new Socket(byName, 20029);
        OutputStream out = socket.getOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(out);
        bufferedOutputStream.write("good,你是一只猪,真的".getBytes());
        bufferedOutputStream.flush();
        socket.shutdownOutput();

        //wait(2000);
        //BufferedInputStream bufferedInputStream= new BufferedInputStream(in);
        InputStream in = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(in);
        // ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        char[] buffer = new char[6];
        int len;
        while ((len = inputStreamReader.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, len));
        }
       // System.out.println(sb);
        //使用if判断一下是不是null
        in.close();
        out.close();
        bufferedOutputStream.close();
        socket.close();

    }

    //服务端
    @Test
    public void server3() throws IOException {//应该用trycatch
        ServerSocket serverSocket = new ServerSocket(20029);
        Socket socket = serverSocket.accept();
        InputStream in = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(in);
        // ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        char[] buffer = new char[6];
        int len;
        while ((len = inputStreamReader.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, len));
        }


        OutputStream out = socket.getOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(out);
//        long start =System.currentTimeMillis();
//        long end =0;
        bufferedOutputStream.write("good,你是一只猪,真的".getBytes());
        bufferedOutputStream.flush();


        socket.shutdownOutput();


        bufferedOutputStream.close();
        inputStreamReader.close();
        in.close();
        serverSocket.close();
        //byteArrayOutputStream.close();
    }

}
