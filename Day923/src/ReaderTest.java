import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Yifei.Hu
 * @create 2021-09--11:16
 */
public class ReaderTest {
    @Test
    public void testReader() throws IOException {
        File file = new File("/Users/yifei.hu/NoUpdate/Java/HighSenior/Day923/src/hello.txt");
        FileReader fileReader = new FileReader(file);
        try {
            char[] chars = new char[5];
            int len;
            while ((len = fileReader.read(chars)) != -1) {
                System.out.println(new String(chars, 0, len));
            }
            ;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
        }

    }

    @Test
    public void testWriter() throws IOException {
        File file1 = new File("/Users/yifei.hu/NoUpdate/Java/HighSenior/Day923/src/hello.txt");
        FileReader fileReader = new FileReader(file1);
        File file2 = new File("/Users/yifei.hu/NoUpdate/Java/HighSenior/Day923/src/hello1.txt");
        FileWriter fileWriter = new FileWriter(file2, false);
        char[] chars = new char[5];
        int len;
        while ((len = fileReader.read(chars)) != -1) {
            fileWriter.write(chars, 0, len);
        }
        fileWriter.close();
        fileReader.close();
        System.out.println();
    }


}