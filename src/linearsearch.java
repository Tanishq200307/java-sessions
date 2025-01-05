public class linearsearch {
    public static void main(String[] args) {
        int[] nums = {12, 32, 564, 234, 324, 743, 234, 56, 8, 3, 23, 567, 34, 3};
        System.out.println(linearSearch1(nums,10));
        int ans = linearSearch(nums, 3);
        System.out.println(ans);
    }

    //search in the array: return the index in which element is found
    //return -1 if not found
    static int linearSearch1(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }

            //this line will execute if none of the element will br found
            //hence the target not found
            return Integer.MAX_VALUE;
        }
        static int linearSearch(int[] arr, int target) {
            if (arr.length == 0) {
                return -1;
            }

                for (int element : arr) {
                    if (element == target) {
                        return element;
                    }
                }
                //this line will execute if none of the element will br found
                //hence the target not found
                return -1;
            }
    }
