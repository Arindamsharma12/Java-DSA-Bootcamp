public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Arindam";
        {
//          int a = 78; // already initialised outside the block in the same function
            a = 239; // reasign the original ref variable to some other value
            System.out.println(a);
            int c = 78;
            // values initialised in this block, will remain in block
            name = "Rahul";
            System.out.println(name);
        }
    // System.out.println(c); // Error: Blocked Scope
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
//            int a = 0; // can not initialised 'a'
        }
//       System.out.println(i); // can not use 'i' outside for loop
    }
    static void random(int marks){
        int num = 67;
        System.out.println(marks);
    }
}
