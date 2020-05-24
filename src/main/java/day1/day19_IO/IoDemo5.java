package day1.day19_IO;

import java.io.File;

public class IoDemo5 {
    public static void main(String[] args){
        File file = new File("C:\\Users\\anier\\Downloads\\aa.txt");
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.isHidden());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

    }
}
