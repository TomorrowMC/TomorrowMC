import org.junit.Test;

import java.io.*;
import java.util.LinkedHashMap;

/**
 * @author Yifei.Hu
 * @create 2021-09--12:52
 */
public class TestEncrypt {
 @Test
    public void testEncrypt()  {
     FileInputStream fileInputStream = null;
     FileOutputStream fileOutputStream = null;
     try {
         fileInputStream = new FileInputStream("/Users/yifei.hu/NoUpdate/Java/HighSenior/Day923/src/Test加密.JPG");
         fileOutputStream = new FileOutputStream("/Users/yifei.hu/NoUpdate/Java/HighSenior/Day923/src/Test解密.JPG");
         byte[] bytes = new byte[1024];
         int len;
         while ((len = fileInputStream.read(bytes))!=-1) {
             for (int i = 0; i < len; i++) {
                 bytes[i] = (byte)(bytes[i] ^ 5);
             }
             fileOutputStream.write(bytes);
         }
     } catch (IOException e) {
         e.printStackTrace();
     }finally {
         if (fileInputStream != null) {
             try {
                 fileInputStream.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
         if(fileOutputStream != null){
             try {
                 fileInputStream.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
     }


 }

 @Test
    public void TimesTest(){
     FileReader fileReader =null;
     FileWriter fileWriter=null;
     try {
         fileReader=new FileReader("/Users/yifei.hu/NoUpdate/Java/HighSenior/Day923/src/hello.txt");
         LinkedHashMap<Character,Integer> linkedHashMap=new LinkedHashMap();
        fileWriter = new FileWriter("/Users/yifei.hu/NoUpdate/Java/HighSenior/Day923/src/统计.txt");
         char[] chars = new char[4];
         int len;
         while ((len=fileReader.read(chars))!=-1) {
             for (int i = 0; i < len; i++) {
                 if (!linkedHashMap.containsKey(chars[i])){
                     linkedHashMap.put(chars[i],1);
                 }else{
                   int x =  linkedHashMap.get(chars[i]);
                   x++;
                     linkedHashMap.put(chars[i],x);
                 }
             }
         }
         fileWriter.write(linkedHashMap.toString());
     } catch (IOException e) {
         e.printStackTrace();
     }finally {
         if (fileWriter != null) {
             try {
                 fileWriter.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
         if (fileReader != null) {
             try {
                 fileReader.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
     }

 }
}
