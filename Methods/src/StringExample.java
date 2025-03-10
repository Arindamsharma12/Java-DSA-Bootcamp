public class StringExample {
    public static void main(String[] args) {
        String message = myGreet("Arindam Sharma");
        System.out.println(message);
    }

    static  String myGreet(String msg){
        String str = "Hello " + msg;
        return str;
    }


    static String greet(){
        String str = "How are you?";
        return str;
    }
}
