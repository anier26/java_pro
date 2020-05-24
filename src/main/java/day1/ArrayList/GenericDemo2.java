package day1.ArrayList;

public class GenericDemo2 {
    public static void main(String[] args){

        ObjectTool<String> objectTool = new ObjectTool<>();
        objectTool.setObj("aha");
        System.out.println(objectTool.getObj());

        ObjectTool<Integer> objectTool1 = new ObjectTool<>();
        objectTool1.setObj(10);
        System.out.println(objectTool1.getObj());

    }
}
