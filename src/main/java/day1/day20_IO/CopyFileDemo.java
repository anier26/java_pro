package day1.day20_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("a.txt");
        //写数据：
        FileOutputStream fos = new FileOutputStream("b.txt");


        int by = 0;

        while ((by = fis.read())!= -1){
            fos.write(by);
        }

        fis.close();
        fis.close();
    }
}
