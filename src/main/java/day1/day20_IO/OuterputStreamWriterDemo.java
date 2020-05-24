package day1.day20_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OuterputStreamWriterDemo {
    public static void main(String[] args) throws IOException {

//        OutputStreamWriter osw = new OutputStreamWriter(
//                new FileOutputStream("a.txt"));

        //指定字符集编码:

        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("aa.txt"),"utf-8");

        osw.write("aha");
        osw.write("中国");

        osw.close();


        OutputStreamWriter osw1 = new OutputStreamWriter(
                new FileOutputStream("aha.txt"),"GBK");
        osw1.write("aha");
        osw1.write("中国");
        osw1.close();
    }
}
