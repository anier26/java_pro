package day1.day20_IO;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyFileTest2 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();


        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("bage");

        BufferedWriter bw = new BufferedWriter(new FileWriter("aa.txt"));
        for(String str: list){
            bw.write(str);
        }
        bw.close();
    }
}
