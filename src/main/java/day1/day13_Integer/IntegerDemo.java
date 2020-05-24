package day1.day13_Integer;

public class IntegerDemo {
    public static void main(String[] args){
        int i = 100;
        Integer ii = new Integer(i);
        System.out.println("引用类型Integer: " + ii);

        String s = "100";
        Integer iii = new Integer(s);
        System.out.println("iii: " + iii);

    }
}
