package day1.day20_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OuterputStreamWriterDemo2 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("a.txt"));
//        osw.write("aha");
//        osw.write(97);

        char[] chs = {'a','b','c',100,101};
        osw.write(chs);

        char[] chs1 = {'o','p','q','r','s','t'};

        osw.write(chs1,0,3);
        osw.write("===aha===");

        osw.write("好好学习,天天向上",2,3);

        osw.flush();
        osw.close();
    }
}
