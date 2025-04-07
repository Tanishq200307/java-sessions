import java.sql.Array;
import java.util.Arrays;

public class prodOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));

    }
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];
        left[0] = 1;
        for(int i = 1;i<n;i++){
            left[i] = left[i-1]*nums[i-1];
        }
        right[n-1] = 1;
        for(int i = n-2;i>=0;i--){
            right[i] = right[i+1]*nums[i+1];
        }
        for(int i = 0;i<n;i++){
            ans[i] = left[i]*right[i];
        }
        return ans;
    }
//        int[] ans = new int[nums.length];
//        for(int i = 0;i<nums.length;i++){
//            int prod = 1;
//            for(int j = 0;j<nums.length;j++){
//                if(i==j){
//                    continue;
//                }else{
//                    prod = prod*nums[j];
//                    ans[i] = prod;
//                }
//            }
//        }
//        return ans;
//    }

}
