package day1.day18_Map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args){
        String str = "aababcabcdabcde";
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        char[] chs = str.toCharArray();
        for(char ch: chs){
            Integer ii = treeMap.get(ch);
            if(ii == null){
                treeMap.put(ch,1);
            }else {
                ii++;
                treeMap.put(ch,ii);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        Set<Character> set = treeMap.keySet();
        for(Character set_i: set){
            Integer value = treeMap.get(set_i);
            stringBuilder.append(set_i).append("(").append(value).append(")");
        }
        System.out.println(stringBuilder);
    }
}
