package day1.day20_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");

        //写入一个字节范围内的int值;
        fos.write(97);
        byte[] bys = {97,98,99,100,101};
        fos.write(bys);
        fos.write(bys,1,3);

        fos.close();
    }
}
