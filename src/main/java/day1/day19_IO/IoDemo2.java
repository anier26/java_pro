package day1.day19_IO;

import java.io.File;
import java.io.IOException;

public class IoDemo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\anier\\Downloads\\demo"); //如果存在这样的文件夹就不创建
        System.out.println("mkdir: " + file.mkdir());

        File file1 = new File(file,"a.txt");
        System.out.println("createFile:" + file1.createNewFile());

        File file2 = new File("C:\\Users\\anier\\Downloads\\test");
        File file3 = new File(file2,"aaa");
        System.out.println("mkdirs: " + file3.mkdirs());//如果父文件夹不存在,就一起创建


    }

}
