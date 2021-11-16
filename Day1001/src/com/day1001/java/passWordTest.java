package com.day1001.java;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

/**
 * @author Yifei.Hu
 * @create 2021-10--20:03
 */
public class passWordTest {


    //成功！！！！！！！！！！！但是需要把密匙改成同一行
    @Test
    public void encrypt() throws Exception {
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("IMG.JPG"));
//        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("encryptJPG.JPG"));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("encryptJPG.JPG"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("IMG解密.JPG"));
        RandomAccessFile raf = new RandomAccessFile("key.txt", "r");
        byte[] bytes = new byte[1];
        byte[] bytesOfKe = new byte[1];
        int len = 0;
        String strKey;
        int key = 0;
        raf.seek(1);
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            if (raf.getFilePointer() == 20) {
                raf.seek(1);
            }
            len = raf.read(bytesOfKe);
            strKey = new String(bytesOfKe,0,len);
            key = Integer.parseInt(strKey);
                bytes[0] = (byte) (bytes[0] ^ key);
            bufferedOutputStream.write(bytes, 0, len);
        }
    }


    //成功！！！！！！！！！！！
    @Test
    public void encrypt1() throws Exception{
        //前两行加密，后两行解密
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("IMG.JPG"));
//        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("encryptJPG.JPG"));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("encryptJPG.JPG"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("IMG解密.JPG"));
        //读取key文件
        RandomAccessFile raf = new RandomAccessFile("key.txt","r");
        byte[] bytes = new byte[10];
        int len = 0;
        //key文件读取需要str转成int，所以需要以下两个临时文件
        String strKey;
        int key = 0  ;
        //开始循环读取
        while ((len=bufferedInputStream.read(bytes)) != -1) {
            //读取key//如果是null指针需要重置
            if((strKey=raf.readLine())==null){
                raf.seek(0);
                strKey = raf.readLine();
            }
            key =Integer.parseInt(strKey);
                for (int i = 0; i < bytes.length; i++) {
                    //使用key文件加密或者解密
                    bytes[i]= (byte) (bytes[i]^key);
                }
                bufferedOutputStream.write(bytes,0,len);

        }
        raf.close();
        bufferedOutputStream.close();
        bufferedInputStream.close();
    }


    //我也不知道为什么失败了


    @Test
    public void sender()throws Exception {
        InetAddress inetAddress = InetAddress.getLocalHost();
        Socket socket = new Socket(inetAddress, 8891);
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("IMG.JPG"));
        RandomAccessFile raf = new RandomAccessFile("key.txt", "r");
        bufferedOutputStream.write("我要开始发送了".getBytes());
        byte[] bytes = new byte[1];
        int len = 0;
        //key文件读取需要str转成int，所以需要以下两个临时文件
        String strKey;
        int key = 0  ;
        //开始循环读取
        raf.seek(0);
        while ((len=bufferedInputStream.read(bytes)) != -1) {
            //读取key//如果是null指针需要重置
            if((strKey=raf.readLine())==null){
                raf.seek(0);
                strKey = raf.readLine();
            }
            key =Integer.parseInt(strKey);
            for (int i = 0; i < bytes.length; i++) {
                //使用key文件加密或者解密
                bytes[i]= (byte) (bytes[i]^key);
            }
            bufferedOutputStream.write(bytes,0,len);

        }
//        bufferedOutputStream.close();
//        bufferedInputStream.close();
//        inputStreamReader.close();
//        raf.close();
//        socket.close();

    }

    @Test
    public void receiver() throws Exception {
        ServerSocket serverSocket = new ServerSocket(8891);
        Socket socket = serverSocket.accept();
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(in);
        RandomAccessFile raf = new RandomAccessFile("key.txt", "r");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("encryptJPG.JPG"));
        byte[] bytes = new byte[1];
        int len = 0;
        //key文件读取需要str转成int，所以需要以下两个临时文件
        String strKey;
        int key = 0  ;
        //开始循环读取
        raf.seek(0);
        while ((len=bufferedInputStream.read(bytes)) != -1) {
            //读取key//如果是null指针需要重置
            if((strKey=raf.readLine())==null){
                raf.seek(0);
                strKey = raf.readLine();
            }
            key =Integer.parseInt(strKey);
            for (int i = 0; i < bytes.length; i++) {
                //使用key文件加密或者解密
                bytes[i]= (byte) (bytes[i]^key);
            }
            bufferedOutputStream.write(bytes,0,len);

        }
//        raf.close();
//        bufferedOutputStream.close();
//        bufferedInputStream.close();
//        socket.close();
//        serverSocket.close();
//        out.close();


    }

    @Test
    public void testCSVersion() throws Exception{
        RandomAccessFile raf = new RandomAccessFile("key.txt", "r");
        BufferedWriter bufferedOutputStream = new BufferedWriter(new FileWriter("csv.csv"));
        
    }
    @Test
    public void testProperties() throws Exception {
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("good.properties");
        props.load(fis);
       String string= props.getProperty("name");
        String string1= props.getProperty("age");
        System.out.println(string+string1);
    }
}
