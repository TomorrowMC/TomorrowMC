import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Yifei.Hu
 * @create 2021-09--23:25
 */
public class UDPTest {
    @Test
    public void sender() throws IOException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        DatagramSocket datagramSocket = new DatagramSocket();
        byte[] bytes= "good".getBytes();
        DatagramPacket datagramPacket= new DatagramPacket(bytes, 0, bytes.length,inetAddress,8081);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
@Test
    public void receiver() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(8081);
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length);
        datagramSocket.receive(datagramPacket);
    System.out.println(new String(bytes));
    datagramSocket.close();
    }

}
