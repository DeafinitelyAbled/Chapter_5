/*
 * %s is string specifier
 * %(flags)(width)(.precision)s
 *
 * - flag, imagine it as a sign to add spaces if width is specified. non-negative is left space, negative is right space
 * - width specifies the minimum number of characters to print. If no available space, the string is not truncated, otherwise padded
 * - .precision specifies the maximum number of characters to print. If string has more characters, then truncated.
 */

public class StringFormat {
    public static void main(String[] args) {
        String string = "Formatting";

        // without flags, width, or precision (%n is the new line)
        System.out.printf("%s%n", string);

        // with width
        System.out.printf("%15s%n", string); // formatting is 10 characters, 5 remaining is padded on the left of string
        System.out.printf("%-15s String%n", string); // negative flag is given, so 5 spaces padded after Formatting, and before String
        System.out.println("");

        System.out.printf("Dog age in human years (dogyears.com)\n\n");
        System.out.printf("-------------------------\n");

        // set num char for each column, left aligned
        System.out.printf("%-10s | %-12s\n", "Dog age", "Human age");
        System.out.printf("-------------------------\n");

        // set num char for each column, first col left aligned
        System.out.printf("%-10s | %12s\n", "2 months", "14 months");
        System.out.printf("%-10s | %12s\n", "6 months", "5 years");
        System.out.printf("%-10s | %12s\n", "8 months", "9 years");
        System.out.printf("%-10s | %12s\n", "1 year", "15 years");
        System.out.printf("-------------------------\n");
    }

}