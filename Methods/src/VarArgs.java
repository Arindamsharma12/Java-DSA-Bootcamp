import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        display(1,2,3,4,5,6);
        multipleArgs(3,12,"Hello","Arindam Sharma","I am good boy");
    }

    static void multipleArgs(int a, int b,String ...v){

    }

    static void display(int ...a){
        System.out.println(Arrays.toString(a));
    }
}
