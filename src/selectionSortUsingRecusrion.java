import java.sql.Array;
import java.util.Arrays;

public class selectionSortUsingRecusrion {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        selection(arr, arr.length,0,0);
        System.out.print(Arrays.toString(arr));

    }
    static void selection(int[] arr,int row,int col,int max){
        if(row==0){
            return;
        }
        if(col<row){
            if(arr[col]>arr[max]){
                selection(arr,row,col+1,col);
            }else {
                selection(arr,row,col+1,max);
            }
        }else {
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;
            selection(arr,row-1,0,0);
        }

    }
}
