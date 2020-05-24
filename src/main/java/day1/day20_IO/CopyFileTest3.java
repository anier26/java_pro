package day1.day20_IO;

import java.io.*;

import static com.sun.deploy.cache.Cache.copyFile;

public class CopyFileTest3 {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("C:\\Users\\anier\\Downloads");
        File destFolder = new File("C:\\Users\\anier\\Downloads\\demo");


        if(!destFolder.exists()){
            destFolder.mkdir();
        }

        File[] files = srcFolder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file1 = new File(dir,name);

                return file1.isFile();
            }
        });

        for (File file1: files){
            String name = file1.getName();
            System.out.println(name);
            File newFile = new File(destFolder,name);
            replaceFile(file1,newFile);
        }
    }

    private static void replaceFile(File file1, File newFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file1));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));

        byte[] bys = new byte[1024];
        int len =0;
        while ((len = bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();
    }
}
