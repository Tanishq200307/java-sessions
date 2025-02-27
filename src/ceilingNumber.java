public class ceilingNumber {
    public static void main(String[] args) {
        int[] arr1 = {1, 22, 33, 44, 55, 66, 77, 88, 99};
        int target = 100;
        int ans = ceilingNumber(arr1, target);
        System.out.println(ans);
        char[] characters = {'a','b','d','f','g'};
        char letterTar = 'h';
        char letters1 = (char) letters(characters,letterTar);
        System.out.println(letters1);


    }

    static int ceilingNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return arr[start];
    }

    static int letters(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
             if (target < letters[mid]) {
                end = mid - 1;
            } else if (target > letters[mid]) {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}

