package day1.day19_IO;

import java.io.File;

public class IoDemo7 {
    public static void main(String[] args){
        File file = new File("C:\\Users\\anier\\Downloads");
        /**
         * 以数组形式返回指定目录下所有文件或文件夹的名称
         *
         */
        String[] strArr = file.list();
        for(String str: strArr){
//            System.out.println(str);
        }

        /**
         * 以数组形式返回指定目录下的文件或文件夹的对象
         * file.getName(),可以获取指定要的文件名或路径 //System.out.println(file1.getName()); //test_env
         */
        File[] files = file.listFiles();
        for(File file1: files){
//            System.out.println(file1); //C:\Users\anier\Downloads\desktop.ini
            System.out.println(file1.getName()); //test_env
        }
    }
}
