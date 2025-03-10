public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println("a = " + a + " b = " + b);
        String name = "Arindam Sharma";
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String name) {
        name = "Ashish Tiwari";
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
