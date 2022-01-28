import java.util.Scanner;

public class EmpFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        System.out.println("Enter Department");
        String dept = in.next();

        switch (empId) {
            case 1 -> System.out.println("Ravi Ranjan Rajak");
            case 2 -> System.out.println("Amar Sinha");
            case 3 -> {
                System.out.println("Sudo");
                switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("There is no Department like that:");
                }
            }
            case 4 -> System.out.println("Vinayak Kashyap:");
            default -> System.out.println("Enter Correct Word anna");
        }
    }
}
