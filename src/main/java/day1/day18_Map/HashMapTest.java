package day1.day18_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {

        HashMap<String, HashMap<String, HashMap<String, HashMap<String, Integer>>>> CZmap = new HashMap<>();
        HashMap<String, HashMap<String, HashMap<String, Integer>>> CZBK = new HashMap<>();
        HashMap<String, HashMap<String,Integer>> class_jc = new HashMap<>();
        HashMap<String, HashMap<String,Integer>> class_jy = new HashMap<>();
        HashMap<String, Integer> Basic = new HashMap<>();
        HashMap<String, Integer> Work = new HashMap<>();

        Basic.put("aha",1001);
        Basic.put("棠樾",1002);

        Work.put("anan",2001);
        Work.put("yian",2003);

        class_jc.put("基础班",Basic);
        class_jy.put("就业班",Work);

        CZBK.put("jc",class_jc);
        CZBK.put("jy",class_jy);

        CZmap.put("传智博客",CZBK);

        Set<String> czmap = CZmap.keySet();
        for( String czbk: czmap){
            System.out.println(czbk);
            Set<String> class_set = CZBK.keySet();
            for(String class_sss:class_set){
                Set<String> keys = (CZBK.get(class_sss)).keySet();
                for (String key: keys){
                    System.out.println("\t" + class_sss + "   "+ key);
                    Set<String> names = (CZBK.get(class_sss)).get(key).keySet();
                    for(String name: names){
                        System.out.println("\t"+ "\t"+name + "   " +(CZBK.get(class_sss)).get(key).get(name));
                    }
                }
            }
        }
    }
}
