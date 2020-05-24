package day1.ArrayList;
//
//public class InterImpl implements Inter<String> {
//    @Override
//    public void show(String s) {
//        System.out.println(s);
//    }
//}

public class InterImpl<T> implements Inter<T>{
    public void show(T t){
        System.out.println(t);
    }
}
