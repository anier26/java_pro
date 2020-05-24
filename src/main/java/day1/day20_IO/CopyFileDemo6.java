package day1.day20_IO;

import java.io.*;

public class CopyFileDemo6 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("b.txt"));

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));

        int len=0;
        char[] chs = new char[1024];

        while ((len=isr.read(chs)) !=-1){
            osw.write(chs,0,len);
        }

        osw.flush();
        isr.close();
        osw.close();
    }
}
