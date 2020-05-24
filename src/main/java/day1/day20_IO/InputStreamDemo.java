package day1.day20_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamDemo{
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(new FileInputStream("b.txt"));

        //一次读取一个字符:
//        int ch=0;
//        while ((ch=isr.read()) !=-1){
//            System.out.print((char) ch);
//        }

//        char[] chs = {'o','p','q','r','s','t'};

        char[] chs = new char[1024];
        int len=0;
        while ((len=isr.read(chs)) != -1){
            System.out.print(new String(chs,0,len));
        }

        isr.close();
    }
}
