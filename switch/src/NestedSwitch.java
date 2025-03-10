import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empId = input.nextInt();
        String Department = input.next();

        switch (empId){
            case 1:
                System.out.println("Arindam Sharma");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3:
                System.out.println("Department");
                switch (Department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Managment Department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter correct empId");
        }

        // better way to write
        switch (empId){
            case 1-> System.out.println("Arindam");
            case 2-> System.out.println("Rahul");
            case 3-> {
                System.out.println("Department");
                switch (Department){
                    case "IT"-> System.out.println("IT Department");
                    case "Management"-> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct empId");
        }
    }
}
