import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {1,5,12,34,55,2,5,3,6,4,9,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){

        for(int i = 0; i<arr.length;i++){
            int last = arr.length-1;
            int masIndex = getMaxIndex(arr ,0 ,last);
            swapArray(arr,masIndex,last);
        }
    }
    static void swapArray(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
    private static int getMaxIndex(int arr[] ,int start , int end){
        int max = start;
        for (int i = start;i<end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
