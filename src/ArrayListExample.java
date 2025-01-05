import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(123);
//        list.add(12);
//        list.add(22);
//        list.add(4);
//        list.add(4);
//        list.add(3);
//        list.add(4);
//        System.out.println(list);
//        System.out.println(list.contains(100));
//        list.set(0,100);
//        System.out.println(list.contains(100));
        for (int i=0;i<7;i++){
            list.add(in.nextInt());
        }

        for(int i = 0 ; i < 7;i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);

     }
}

