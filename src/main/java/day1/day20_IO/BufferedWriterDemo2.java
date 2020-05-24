package day1.day20_IO;

import java.io.*;

public class BufferedWriterDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("b.txt"));

        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));

        String line = null;
    }
}
