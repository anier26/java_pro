package day1.day20_IO;

import java.io.*;

public class CopyFileDemo7 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\anier\\Downloads\\bb.txt");
        FileReader fr = new FileReader("b.txt");

//        int ch=0;
//        while ((ch = fr.read()) !=-1){
//            fw.write(ch);
//        }

        int len=0;
        char[] chs = new char[1024];
        while ((len=fr.read(chs)) != -1){
            fw.write(chs,0,len);
        }

        fr.close();
        fw.close();

    }
}
