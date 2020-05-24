package day1.day20_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("b.txt");

        byte[] bys = new byte[1024];
        int by = 0;
        while ((by = fis.read(bys))!=0){
            fos.write(by);
        }

        fis.close();
        fos.close();
    }
}
