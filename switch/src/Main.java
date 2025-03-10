import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String fruit = input.next();
        int day = input.nextInt();

//        if(fruit.equals("mango")){
//            System.out.println("King of fruits");
//        }
//        if(fruit.equals("apple")){
//            System.out.println("a sweet red fruit");
//        }
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("Please enter a valid fruit");
//        }

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Sturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Please enter number between 1 to 7");
        }

        switch (day) {
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                System.out.println("Weekday");
                break;
            case 6:

            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Please enter number between 1 to 7");
                break;
        }
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Please enter number between 1 to 7");
        }
    }
}