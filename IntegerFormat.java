import java.util.Scanner;

/*
 * %d is integer, long, short number (natural numbers)
 * %(flags)(width)d
 *
 * - flags, imagine this sub-specifier format as a sign to add
 *
 * - width Specifies the minimum number of characters to print.
 * 	If the formatted value has more characters than the width, the value will not be truncated.
 * 	If the formatted value has fewer characters than the width, the output will be padded with spaces
 * 	(or 0's if the '0' flag is specified).
 */

public class IntegerFormat {

    public static void main(String[] args) {
        int number = 1234;

        // without flags and width (%n is the new line)
        System.out.printf("%d%n", number);

        //with width
        System.out.printf("%5d%n", number); // since the space is 4 and minimum width is 5, one space is padded

        //with flag and width
        System.out.printf("%+6d%n", number); // flag sign is a part of space and counted for width length

    }

}
