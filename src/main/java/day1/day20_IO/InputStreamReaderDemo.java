package day1.day20_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("a.txt"));

        int ch = 0;
        while ((ch=isr.read())!=-1){
            System.out.println((char)ch);
        }

        isr.close();
        System.out.println("================");

        InputStreamReader isr1 = new InputStreamReader(
                new FileInputStream("aha.txt"),"GBK");

        int ch1 =0;
        while ((ch1 = isr1.read())!=-1){
            System.out.println((char) ch1);
        }

    }
}
