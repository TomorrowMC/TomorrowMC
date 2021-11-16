import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Yifei.Hu
 * @create 2021-09--12:26
 */
public class RandomTest {
    @Test
    public void testRandom1() throws IOException {
        RandomAccessFile randomAccessFile1 = new RandomAccessFile("randomtest.txt","rw");
            randomAccessFile1.seek(6);
            randomAccessFile1.write("gppd".getBytes());
        randomAccessFile1.close();
    }
    @Test
    public void testRandom2() throws IOException {
        Path path = Paths.get("/Users/yifei.hu/NoUpdate/Java/HighSenior");
        System.out.println(path.getFileName());

    }
}
