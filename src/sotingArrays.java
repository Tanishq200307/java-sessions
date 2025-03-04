import java.sql.Array;
import java.util.Arrays;

public class sotingArrays {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        int temp = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
