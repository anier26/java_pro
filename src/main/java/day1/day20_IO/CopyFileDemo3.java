package day1.day20_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo3 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\anier\\Downloads\\b.txt");

        byte[] bys = new byte[1024];
        int len = 0;

        while ((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        fis.close();
        fos.close();
    }
}
