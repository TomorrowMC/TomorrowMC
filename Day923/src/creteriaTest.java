import org.junit.Test;

import java.io.*;

/**
 * @author Yifei.Hu
 * @create 2021-09--20:55
 */
public class creteriaTest {
    @Test
    public void test() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s="";
        while (bufferedReader.readLine() != null) {
            s = bufferedReader.readLine();
        }
    }

    @Test
    public void test2() throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String string=" ";
    while (bufferedReader.readLine() != null) {
        string=bufferedReader.readLine();
    }

    }

}
