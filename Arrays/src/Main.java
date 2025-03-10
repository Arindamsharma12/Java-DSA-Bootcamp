//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // syntax:
        // datatype[] variable_name = new datatype[size];
//        int[] rnos = new int[5];
        // or directly
//        int [] rnos2 = {23,12,45,32,15};

        int[] rnos; // declaration of array. ros is getting defined in the stack.
        rnos = new int[5]; // actually here object is being created in memory(heap).
        System.out.println(rnos[1]);

        String [] arr= new String[4];
        System.out.println(arr[0]);

    }
}