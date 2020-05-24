package day1.day14_Regex;


public class RegexDemo4 {
    public static void main(String[] args) {

      String ages = "18-24";
      String[] str = ages.split("-");
      for(int x=0; x<str.length; x++){
          System.out.println(Integer.parseInt(str[x]));
      }
    }

}