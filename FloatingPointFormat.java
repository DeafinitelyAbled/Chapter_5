import java.util.Scanner;

/*
 * %f is floating-point/double number with 6 decimals in standard
 * %(flags)(width)(.precision)f
 *
 * - width specifies the minimum number of characters to print
 * - .precision specifies the number of digits to print following the decimal point.
 */
public class FloatingPointFormat {
    public static void main(String[] args) {
        double number = 12.34;
        // without width, flag, or precision
        // %n is the new line format specifier
        System.out.printf("%f%n", number);

        // with precision
        System.out.printf("%.4f%n", number);

        // with width
        System.out.printf("%8.3f%n", number); // 8 minimum width number with 3 precision decimals

        // with flags
        System.out.printf("%+.5f%n", number); // prints + if positive as a flag with 5 precision decimals

        System.out.printf("%08.1f%n", number); // 8 width space (4 spaces taken), 1 precision decimal, 0s for empty spaces (4 empties)

        System.out.println("");

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a distance in miles: ");
        double miles = scnr.nextDouble();
        // Calculate the correspond time to fly/drive distance

        double hoursFly = miles / 500.0;
        double hoursDrive = miles / 60.0;

        // Output resulting values
        System.out.printf("%.2f miles would take:\n", miles);
        System.out.printf("%.2f hours to fly\n", hoursFly);
        System.out.printf("%.2f hours to drive\n", hoursDrive);
    }

}
