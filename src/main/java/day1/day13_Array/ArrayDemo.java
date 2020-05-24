package day1.day13_Array;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        int[] arr2 = {33, 11, 5, 97, 21, 67, 31};

        maoPao(arr);
        maoPao(arr2);
        printArray(arr);
        printArray(arr2);

//        for (int x = 0; x < arr.length-1; x++) { //x 每次比较完的最后一个数都是最大的,最后一个数就不要在比,
//            if (arr[x + 1] < arr[x]) {         // 因为倒数第一个和倒数第二个比完就是全部了
//                int tmp = arr[x];
//                arr[x] = arr[x + 1];
//                arr[x + 1] = tmp;
//            }
//        }
//        printArray(arr);
    }

    private static void maoPao(int[] arr) {
        for (int y=0; y<=arr.length-1; y++){ //y从1开始,比较四次
            for(int x=0; x<arr.length-1-y; x++) { //x 每次比较完以后最后一个数就消失不能再比,第一次比较-0，第二次比较-1..
                if (arr[x + 1] < arr[x]) {
                    int tmp = arr[x];
                    arr[x] = arr[x + 1];
                    arr[x + 1] = tmp;
                }
            }
        }

    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for(int x=0; x<arr.length; x++){
            if(x == arr.length -1){
                System.out.println(arr[x] + "]");
            }else {
                System.out.print(arr[x] + ", ");
            }
        }
    }

    static void printArray(char[] arr) {
        System.out.print("[");
        for(int x=0; x<arr.length; x++){
            if(x == arr.length -1){
                System.out.println(arr[x] + "]");
            }else {
                System.out.print(arr[x] + ", ");
            }
        }
    }
}
