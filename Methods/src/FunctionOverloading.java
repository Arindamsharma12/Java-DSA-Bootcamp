import java.util.Arrays;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun(1);
//        fun("Arindam");
        int s1 = sum(1,2,4);
        int s2 = sum(34,32);
//        System.out.println(s1+ " " +s2);
        demo("Arindam","Keerthiga","Ashish","Komal");
    }

    static void demo(int ...a){
        System.out.println(Arrays.toString(a));
    }

    static void demo(String ...a){
        System.out.println(Arrays.toString(a));
    }

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b,int c){
        return a + b + c;
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
