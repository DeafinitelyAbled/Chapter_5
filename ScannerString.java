import java.util.Scanner;

public class ScannerString {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); 	// System.in is enabled to scan keyboard input
        Scanner stringScan = null; 				// System.in is not enabled, thus scans the defined string
        String userInput;
        String firstName;
        String lastName;
        int age;
        boolean con = true;

        while (con) {
            System.out.println("Enter a first, last names and age: \nEnter \'exit\' to exit.");
            userInput = scnr.nextLine();
            stringScan = new Scanner(userInput);
            firstName = stringScan.next();

            if (firstName.equals("exit")) {
                con = false;
            }
            else {
                System.out.println(firstName);
                lastName = stringScan.next();
                System.out.println(lastName);
                age = stringScan.nextInt();
                System.out.println(age);
            }
        }

    }

}
