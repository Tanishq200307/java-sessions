public class rotatedBinarySearchWithRecursion {
    public static void main(String[] args) {
        int[] array1 = {5,6,7,8,9,1,2,3,4};
        System.out.println(search(array1,4,0,array1.length-1));

    }
    static int search(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
            int mid  = start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(arr[start]<=arr[mid]){
                if (target>=arr[start] && target <=arr[mid]){
                    return search(arr,target,start,mid-1);
                }else {
                    return search(arr,target,mid+1,end);
                }
            }
            if (target>=arr[mid] && target <=arr[end]) {
            return search(arr,target,mid+1,end);
            }
        return search(arr,target,start,mid-1);

    }
}
