import org.junit.Test;

import java.io.*;

/**
 * @author Yifei.Hu
 * @create 2021-09--11:30
 */
public class ObjectTest {
    @Test
    public void ObjectTestOutPut(){
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("objectOutputTest.txt"));
            objectOutputStream.writeObject(new String("good"));
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    @Test
    public void ObjectTestInPut(){
        ObjectInputStream objectInputStream = null;
        Object obj = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("/Users/yifei.hu/NoUpdate/Java/HighSenior/Day929/objectOutputTest.txt"));
            obj = objectInputStream.readObject();
            String str = obj.toString();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (objectInputStream!=null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
    @Test
    public void ObjectTestInPut111(){
        ObjectInputStream objectInputStream = null;
        Object obj = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("/Users/yifei.hu/NoUpdate/Java/HighSenior/Day929/objectOutputTest.txt"));
            obj = objectInputStream.readObject();
            String str = obj.toString();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (objectInputStream!=null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
    class Persontest implements Serializable{
        public static final long serialVersionUID = 1231242141L;
    }
}
