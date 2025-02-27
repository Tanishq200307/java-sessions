public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] descArray = {9, 8, 7, 6, 5, 4, 3, 2, 2, 1, 1};
        int target = 9;
        int ans1 = binaySearch(array, target);
        int ans2 = binaySearch(descArray, target);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(mySqrt(9));
    }

    static int binaySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else
            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1; 
            }
        }
        return -1;
    }
    static int mySqrt(int x) {
        int i = 0;
        while(i<x){
            if(i*i>x){
                break;
            }
        }
        return i;
    }
}
