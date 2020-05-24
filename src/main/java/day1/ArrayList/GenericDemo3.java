package day1.ArrayList;

public class GenericDemo3 {
    public static void main(String[] args){

       ObjectTool2<String> objectTool2 = new ObjectTool2<>();
       objectTool2.show("aha");

       new ObjectTool2<Integer>().show(10);

    }
}
