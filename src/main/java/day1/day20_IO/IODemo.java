package day1.day20_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo {
    public static void main(String[] args) throws IOException {

        File file = new File("a.txt");
        FileOutputStream fos1 = new FileOutputStream("b.txt");
        FileOutputStream fos = new FileOutputStream("a.txt");

        byte[] bys = "hello.Io".getBytes();
        //单个字节写入:
        for(byte by:bys){
            fos.write(by);
        }
        //字节数组写入:
        fos1.write(bys);

        fos.close();
        fos1.close();
    }
}
