package day1.day17_Set;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class ScoreDemo {
    public static void main(String[] args) {
        TreeSet<Score> ts = new TreeSet<>(new Comparator<Score>() {
            @Override
            public int compare(Score o1, Score o2) {
                int num = o2.getSum()-o1.getSum();
                int num2 = num==0? o2.getName().compareTo(o1.getName()): num;
                int num3 = num ==0? o2.getChinese()-o1.getChinese(): num2;
                int num4 = num3 ==0? o2.getMath() - o1.getMath() : num3;
                int num5 = num4 ==0? o2.getEnglish() - o1.getEnglish() : num4;
                return  num5;
            }
        });

        for(int x=0; x<3; x++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入学生姓名: ");
            String name = sc.nextLine();
            System.out.println("请输入学生语文成绩: ");
            int chinese = sc.nextInt();
            System.out.println("请输入学生数学成绩: ");
            int math = sc.nextInt();
            System.out.println("请输入学生英语成绩: ");
            int english = sc.nextInt();

            Score score = new Score(name,chinese,math,english);
            ts.add(score);
        }

        for (Score score: ts){
            System.out.println(score.getName()+ " ===== "+score.getSum());
        }
    }
}
