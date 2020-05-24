package day1.day12_String;

public class StringDemo11 {
    public static void main(String[] args) {
        String str = "woaijavawozhendeaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";

        String value = "java";
        int count = 0;
        int index = -1;
        //方式一:
//        while (true){
//            for (int x=0; x<str.length(); x++) {
//                if (!(str.contains(value))){
//                    break;
//                }else {
//                    count ++;
//                    index = str.indexOf(value) + value.length();
//                    str = str.substring(index);
//                }
//            }
//            break;
//        }
//        System.out.println(count);
//        方式二:
//        while (true){
//            index = str.indexOf(value);
//            if(index == -1){
//                break;
//            }else {
//                count ++;
//                index = index + value.length();
//                str = str.substring(index);
//            }
//        }
//        System.out.println(count);

        while ((index = str.indexOf(value)) != -1){
            count ++;
            str = str.substring(index + value.length());
        }
        System.out.println(count);
    }
}
