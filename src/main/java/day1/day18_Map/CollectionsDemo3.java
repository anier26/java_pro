package day1.day18_Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo3 {
    public static void main(String[] args) {


        String[] color = {"♦","♥","♣", "♠"};
        String daWang = "大王";
        String xiaoW = "小王";

        List<String> pai = new ArrayList<>();

        pai.add(daWang);
        pai.add(xiaoW);

        String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for(String color_n: color){
            for(String num_n: num){
                pai.add(color_n.concat(num_n));
            }
        }
        //洗牌:
        Collections.shuffle(pai);

//        StringBuilder a =new StringBuilder("");
//        StringBuilder b =new StringBuilder("");
//        StringBuilder c =new StringBuilder("");

        ArrayList<String> aha = new ArrayList<>();
        ArrayList<String> 棠樾 = new ArrayList<>();
        ArrayList<String> bage = new ArrayList<>();
        ArrayList<String> di = new ArrayList<>();

        //发牌:
        for(int x=0; x<pai.size(); x++){
           if(x >= pai.size()-3){
               di.add(pai.get(x));
           } else if(x %3 == 1){
               aha.add(pai.get(x));
           }else  if(x %3 == 2){
               棠樾.add(pai.get(x));
           }
           else if(x %3 == 0){
               bage.add(pai.get(x));
           }
        }
        lookPai(aha);
        lookPai(棠樾);
        lookPai(bage);
        lookPai(di);


    }

    public static void lookPai(Collection collection){
        for(Object pai:collection){
            System.out.print(pai + " ");
        }
        System.out.println();
    }
}
