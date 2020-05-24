package day1.day19_IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class IoDemo6 {
    public static void main(String[] args){
        File file = new File("C:\\Users\\anier\\Downloads\\aa.txt");

        System.out.println("getAbsolutePath: " + file.getAbsolutePath()); //绝对路径:
        System.out.println("getPath: " + file.getPath()); //相对路径
        System.out.println("getName: " + file.getName()); //获取名称
        System.out.println("length: " + file.length()); // 获取文件长度,字节数
        System.out.println("lastModified: " +
                new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(file.lastModified())); //获取最后一次修改时间

    }
}
