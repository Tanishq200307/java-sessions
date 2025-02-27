public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,3,4,11,23,44,66,77,165,200};
        int target  = 200   ;
       int ans =  binarySearch(array,target);
        System.out.println(ans);
    }
         static int binarySearch(int[] arr, int target){
             int start = 0;
             int end = arr.length-1;

             while (start<=end){
//                 int mid = (start + end)/2; it might be possible that the start + end exceeds limit will try a new method
                 int mid = start + (end-start)/2;
                 if (target<arr[mid]){
                     end = mid - 1;
                 }else if (target>arr[mid]){
                     start = mid + 1;
                 }else {
                     return mid;
                 }
             }
             return -1;
    }
}
