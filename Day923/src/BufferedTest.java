import org.junit.Test;

import java.io.*;

/**
 * @author Yifei.Hu
 * @create 2021-09--17:28
 */
public class BufferedTest {
    @Test
    public void test() {
        File copyfile = new File("/Users/yifei.hu/NoUpdate/Java/HighSenior/Day923/src/Test.JPG");
        File newfile = new File("/Users/yifei.hu/NoUpdate/Java/HighSenior/Day923/src/Test1.JPG");
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
         try {
            fileOutputStream = new FileOutputStream(newfile);
            fileInputStream = new FileInputStream(copyfile);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte[] buffer = new byte[5];
            int len;
            while ((len = bufferedInputStream.read(buffer))!=-1) {
                bufferedOutputStream.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedOutputStream != null) {
                    bufferedInputStream.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    @Test
    public void test2(){
        FileInputStream inputStream = null;
        FileOutputStream bufferedOutputStream = null;
        try {
            inputStream = new FileInputStream(new File("/Users/yifei.hu/NoUpdate/Java/HighSenior/Day923/src/Test加密.JPG"));
            bufferedOutputStream = new FileOutputStream(new File("/Users/yifei.hu/NoUpdate/Java/HighSenior/Day923/src/Test解密.JPG"));
            byte[] b1 = new byte[20];
            int len;
            while ((len = inputStream.read(b1))!=-1) {
                for (int i = 0; i < len; i++) {
                    b1[i] = (byte)(b1[i] ^5);
                }
                bufferedOutputStream.write(b1,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }


    }
}
