import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     sum();
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter number 2:");
        int num2 = in.nextInt();
        int sum = num2 + num1;
        System.out.println("The sum = " + sum);
    }


    /*
        access modifier (we'll look in OOP) return type name(){
            // body
            return statement;
        }
    */
}