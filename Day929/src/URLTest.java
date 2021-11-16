import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author Yifei.Hu
 * @create 2021-09--23:46
 */
public class URLTest {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://cdn.sspai.com/article/1f39f7c0-92b4-0df8-b325-8a10db78cb55.png?imageMogr2/auto-orient/quality/95/thumbnail/!1420x708r/gravity/Center/crop/1420x708/interlace/1");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.connect();
        InputStream is = conn.getInputStream();
        FileOutputStream fos = new FileOutputStream("sss.jpg");
        byte[] bytes = new byte[1024];
        int len=0;
        while((len = is.read(bytes))!=-1){
            fos.write(bytes, 0, len);
        }
        fos.close();
        is.close();
        conn.disconnect();
    }
}
