package day1.day19_IO;

import java.io.File;
import java.io.FilenameFilter;

public class IoDemo9 {
    public static void main(String[] args){
        File file = new File("C:\\Users\\anier\\Downloads");

        String[] strArr = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //这一步相当于吧指定目录下的文件或文件夹全部转成file对象,
                //然后判断这个对象是不是文件,是文件在判断这个文件是不是.txt结尾, 是就吧符合条件的文件夹名称
                return new File(dir,name).isFile() && name.endsWith(".txt");
            }
        });

        for(String str: strArr){
            System.out.println(str);
        }
    }
}
