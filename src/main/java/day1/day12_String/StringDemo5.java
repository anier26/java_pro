package day1.day12_String;

public class StringDemo5 {
    public static void main(String[] args){
        String s = "Hello123World";

        int countBig = 0;
        int countSml = 0;
        int countNum = 0;

//        方式一:
//        for (int x=0 ; x<s.length(); x++){
//
//            if((s.charAt(x)) >=65 && (s.charAt(x)) < 97){
//                countBig ++;
//            }else {
//                if((s.charAt(x)) >=97){
//                    countSml ++;
//                }else {
//                    countNum ++;
//                }
//            }
//
//            System.out.print((char)(s.charAt(x)));
//        }

        for(int x=0; x<s.length(); x++){
            char ch = s.charAt(x);
            if(ch >= '0' && ch<='9'){
                countNum ++;
            }else {
                if (ch >= 'a' && ch <='z'){
                    countSml ++;
                }else {
                    countBig ++;
                }

            }


        }
        System.out.println();
        System.out.println(countBig);
        System.out.println(countSml);
        System.out.println(countNum);

    }
}
