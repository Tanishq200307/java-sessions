public class searchInRange {
    public static void main(String[] args) {
        int[] nums = {23,2,34,4,5,18,34,56,3,1,3,456,67,78,9,0,3,4,56,7};
        System.out.println(searchInRange(nums,56,1,8));
    }
    static int searchInRange(int[] arr,int target,int start, int end){
        if (arr.length==0){
            return -1;
        }
        for (int i = start; i < end; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
