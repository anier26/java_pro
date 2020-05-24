package day1.day17_Set;


import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Student1 s1 = new Student1(1,"aha","hz");
        Student1 s5 = new Student1(1,"aha","hz");
        Student1 s2 = new Student1(2,"aha1","hz");
        Student1 s3 = new Student1(3,"aha2","hz");
        Student1 s4 = new Student1(4,"aha2","hz");
        Student1 s6 = new Student1(4,"aha3","hz");

        TreeSet<Student1> ts = new TreeSet();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for(Student1 stu: ts){
            System.out.println(stu.getName()+" " + stu.getAddr() + " " + stu.getAge());
        }
    }
}
