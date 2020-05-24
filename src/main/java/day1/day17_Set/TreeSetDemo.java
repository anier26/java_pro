package day1.day17_Set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args){

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(61);
        treeSet.add(61);
        treeSet.add(100);
        treeSet.add(20);
        treeSet.add(37);
        treeSet.add(52);

        for(Integer ii: treeSet){
            System.out.println(ii);

        }
    }
}
