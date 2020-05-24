package day1.day12_String;

public class StringDemo9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String str = getString(arr);
        System.out.println(str);
    }

    public static String getString(int[] arr){

        String str = "";
        str += "[";
        for (int x=0; x<arr.length; x++){
            if (x == arr.length -1){
                str += arr[x] + "]";
            }else {
                str += arr[x] + ", ";
            }
        }
        return str;
    }
}
