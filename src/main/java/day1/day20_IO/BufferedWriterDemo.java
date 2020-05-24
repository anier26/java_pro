package day1.day20_IO;

import java.io.*;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("aa.txt"));
        BufferedReader br = new BufferedReader(new FileReader("b.txt"));

        int ch = 0;
        while ((ch = br.read()) !=-1){
            bw.write(ch);
        }


        int len =0;
        char[] chs = new char[1024];
        while ((len = br.read(chs)) !=-1){
            bw.write(chs,0,len);
        }

        bw.flush();

        br.close();
        bw.close();
    }
}
