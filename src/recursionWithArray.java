public class recursionWithArray {
    public static void main(String[] args) {

        int[] array1 = {1,3,4,5,6,7,9};
        System.out.println(sorted(array1,0));
    }
    static boolean sorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr, index+1);
    }
}
