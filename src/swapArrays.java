import java.util.Arrays;

public class swapArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2] = temp;
    }
    static void reverse(int[] array){
        int start = 0;
        int end = array.length-1;
        while(start<end){
            swap(array,start,end);
            start++;
            end--;
        }
    }

}
