import java.util.Arrays;
import java.util.Scanner;

public class colNotFound {
    public static void main(String[] args) {
                int[][] arr = {
                        {1,2,3,4},
                        {1,3},
                        {1,3,4,5,67,8}
                };
        for (int row = 0;row< arr.length;  row++){
            for (int col= 0;col < arr[row].length;col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
