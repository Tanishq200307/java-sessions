public class searchMaxMin {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,23,4,56,7,-23};
        System.out.println(Min(nums));
    }
    static int Min(int[] array){
        if(array.length==0){
            return -1;
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            int Char = array[i];
            if(Char < min){
                min = Char;
            }
        }
        return min;
    }
}
