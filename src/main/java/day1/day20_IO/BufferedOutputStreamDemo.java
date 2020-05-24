package day1.day20_IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("aa.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);

        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("aa.txt"));

        bos.write("hello".getBytes());



        bos.close();
    }
}
