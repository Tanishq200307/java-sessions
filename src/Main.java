import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//int [] arr = new int [5];
//        arr[0] = 23;
//        arr[1] = 23;
//        arr[2] = 23;
//        arr[3] = 23;
//        arr[4] = 23;
//        System.out.println(arr[2]);
//for(int i = 0;i<arr.length;i++) {
//    arr[i] = in.nextInt();
//}
//        System.out.println(Arrays.toString(arr));
        String[] str = new String[4];
        for(int i=0;i<str.length ;i++){
            str[i]= in.next();
        }
        System.out.println(Arrays.toString(str));
  }
}