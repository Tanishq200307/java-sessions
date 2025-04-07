import java.sql.Array;
import java.util.ArrayList;

public class linearSearchWithRecursion {
    public static void main(String[] args) {
        int[] array1 = {2,4,57,8,9,31,23,5,2,1,34,4,4,2};
//        System.out.println(find(array1,56,0));
//        System.out.println(find1(array1,56,0));
//        System.out.println(findAllIndex(array1,4,0,new ArrayList<>()));
        System.out.println(findAllIndex1(array1,2,0));
    }

    static boolean find(int[] arr,int target,int index) {
        if (index == arr.length - 1) {
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }
    static int find1(int[] arr,int target,int index){
        if (index==arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return find1(arr,target,index+1);
    }
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index,ArrayList<Integer> list){
        if (index==arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
       return findAllIndex(arr,target,index+1,list);
    }

    static ArrayList<Integer> findAllIndex1(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index==arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow =  findAllIndex1(arr,target,index+1);
        list.addAll(ansFromBelow);
        return list;
    }
}
