package day1.ArrayList;

import java.util.ArrayList;

public class ForDemo {
    public static void main(String[] args){
        int[] arr = {11,22,33,44,55,66};

        for(int x=0; x<arr.length; x++){
                System.out.print(arr[x] + ", ");
        }

        System.out.println("==========");

        for(int ini: arr){
            System.out.print(ini + ", ");
        }
        System.out.println("==========");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aha");
        arrayList.add("baobao");
        arrayList.add("bage");
        for(String str: arrayList){
            System.out.println(str);
        }
    }
}
