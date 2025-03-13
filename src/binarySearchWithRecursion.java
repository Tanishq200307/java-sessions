public class binarySearchWithRecursion {
    public static void main(String[] args) {
        int [] arr = {1,3,4,23,34,45,56,78,99,108};
        System.out.println(search(arr,34,0,arr.length));

    }
    static int search(int [] array,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(array[mid]==target){
            return mid;
        }
        if(target<array[mid]){
          return search(array,target,start,end = mid-1);
        }
        return search(array,target,start = mid+1,end);
    }
}
