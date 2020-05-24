package day1.day20_IO;

import java.io.*;

public class CopyFileTest4 {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("C:\\Users\\anier\\Downloads");
        final File destFolder = new File("C:\\Users\\anier\\Downloads\\demo");


        if(!destFolder.exists()){
            destFolder.mkdir();
        }

        File[] files = srcFolder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file1 = new File(dir,name);

                return file1.isFile() && file1.getName().endsWith(".vep");
            }
        });

        for (File file1: files){
            String name = file1.getName();
            File newFile = new File(destFolder,name);
            replaceFile(file1,newFile);
        }

        final File[] newFiles = destFolder.listFiles();
        for (File file1: newFiles){
            File newName = new File(destFolder,file1.getName().substring(0,2).concat(".haha"));
            System.out.println(file1.renameTo(newName));
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
