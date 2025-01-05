import java.util.Arrays;

public class searchIn2Darrays {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 45, 647},
                {23, 45, 66},
                {12, 34, 55, 67}
        };
        System.out.println(Arrays.toString(search2D(arr, 67)));
        System.out.println(max(arr));
    }
    //Max value in the 2D Array;
    static int[] search2D(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[]{1, -1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int element = arr[row][col];
                if (element == target) {
                    return new int[]{row, col};
                }

            }

        }
        return new int[]{1, -1};
    }

    static int max(int[][] arr) {

        if (arr.length == 0) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int element = arr[row][col];
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}

