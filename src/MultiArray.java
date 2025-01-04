import java.util.ArrayList;
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        //intialization
        for (int i= 0;  i<3 ; i++){
            lists.add(new ArrayList<>());
        }
        //add elements
        Scanner in = new Scanner(System.in);
        for (int i = 0;i<3;i++) {
            for (int j = 0;j< 3;j++){
                lists.get(i).add(in.nextInt());
            }
        }
        System.out.println(lists);
    }
}
