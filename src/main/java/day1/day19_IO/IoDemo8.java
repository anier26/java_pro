package day1.day19_IO;

import java.io.File;

public class IoDemo8 {
    public static void main(String[] args){
        File file = new File("C:\\Users\\anier\\Downloads");

        File[] files = file.listFiles();

        for(File file_ : files){
            if(file_.isFile()){
                if(file_.getName().endsWith(".txt")){
                    System.out.println(file_.getName());
                }
            }
        }

    }
}
