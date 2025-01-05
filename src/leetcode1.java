public class leetcode1 {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8,34,564,34,5,6,7,2 };
        System.out.println(evenNumbers(nums));
    }
    static int evenNumbers(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                count=count+1;
            }
        }
        return count;
    }
}
