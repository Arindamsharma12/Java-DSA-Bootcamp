import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // Syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        Scanner in = new Scanner(System.in);
//        list.add(67);
//        list.add(24);
//        list.add(14);
//        list.add(34);
//        list.add(55);
//        list.add(67);
//
//        System.out.println(list.contains(14));
//
//        list.set(0,99);
//        list.remove(2);
        //input
        for(int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }

        // get item at index
        for(int i = 0;i < 5; i++){
            System.out.println(list.get(i));
        }
//        System.out.println(list);
    }
}
