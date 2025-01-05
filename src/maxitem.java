public class maxitem {
    public static void main(String[] args) {
        int[] arr = {100, 3, 4, 57, 653, 34534567, 8, 9, 133213};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
