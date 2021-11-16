import java.io.File;

/**
 * @author Yifei.Hu
 * @create 2021-09--10:11
 */
public class ReviewTest {
    private static int i=0;
    public static void main(String[] args) {
        File file = new File("/Users/yifei.hu/Downloads");
        ReviewTest.load(file);
        System.out.println(i);
    }

    public static void load( File file){
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f:
                 files) {
                load(f);
            }
        }else{
            i+=file.length();
        }
    }
}
