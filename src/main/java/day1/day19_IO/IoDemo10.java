package day1.day19_IO;

import java.io.File;
import java.io.FilenameFilter;

public class IoDemo10 {
    public static void main(String[] args){
        final File file = new File("C:\\Users\\anier\\Downloads");

        String[] files = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file1 = new File(dir,name);

                return file1.isFile() && file1.getName().endsWith(".txt");
            }
        });

        for(int x=0; x<files.length; x++){

            File file1 = new File(file,"00"+x+"介绍".concat(files[x]));
            File file2 = new File(file,files[x]);

            System.out.println(file2.renameTo(file1));


        }
    }
}
