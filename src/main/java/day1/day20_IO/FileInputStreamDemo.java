package day1.day20_IO;

import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
//        int con = fis.read();
//        System.out.println(con);

        int by=0;
        while ((by=fis.read())!= -1){
            System.out.println((char)(by));
        }

        fis.close();
    }
}
