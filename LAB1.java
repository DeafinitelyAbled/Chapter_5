import java.util.Scanner;
/*
    Complete main() to read dates from input, one date per line. Each date's format must be as follows:
    March 1, 1990. Any date not following that format is incorrect and should be ignored.
    Use the substring() method to parse the string and extract the date. The input ends with -1 on a line alone.
    Output each correct date as: 3-1-1990.

    Ex: If the input is:
    March 1, 1990
    April 2 1995
    7/15/20
    December 13, 2003
    -1

    then the output is:
    3-1-1990
    12-13-2003

    Use the provided getMonthAsInt() method to convert a month string to an integer.
    If the month string is valid, an integer in the range 1 to 12 inclusive is returned, otherwise 0 is returned.
    Ex: getMonthAsInt("February") returns 2 and getMonthAsInt("7/15/20") returns 0.
*/

public class LAB1 {
    public static int getMonthAsInt(String monthString) {
        int monthInt;

        // Java switch/case statement
        switch (monthString) {
            case "January":
                monthInt = 1;
                break;
            case "February":
                monthInt = 2;
                break;
            case "March":
                monthInt = 3;
                break;
            case "April":
                monthInt = 4;
                break;
            case "May":
                monthInt = 5;
                break;
            case "June":
                monthInt = 6;
                break;
            case "July":
                monthInt = 7;
                break;
            case "August":
                monthInt = 8;
                break;
            case "September":
                monthInt = 9;
                break;
            case "October":
                monthInt = 10;
                break;
            case "November":
                monthInt = 11;
                break;
            case "December":
                monthInt = 12;
                break;
            default:
                monthInt = 0;
        }

        return monthInt;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Read dates from input, parse the dates to find the ones
        // in the correct format, and output in m-d-yyyy format
        String inputDate = scnr.nextLine();

        while (!inputDate.equals("-1")) {
            // Parse input date to check if it is in the expected format
            String[] dateParts = inputDate.split(" ");
            if (dateParts.length == 3 && dateParts[1].endsWith(",")
                    && getMonthAsInt(dateParts[0]) != 0) {
                // Extract the month, day, and year from the input date
                String month = dateParts[0];
                int day = Integer.parseInt(dateParts[1].substring(0, dateParts[1].length() - 1));
                int year = Integer.parseInt(dateParts[2]);

                // Output the date in m-d-yyyy format
                System.out.printf("%d-%d-%d\n", getMonthAsInt(month), day, year);
            }

            // Read the next input date
            inputDate = scnr.nextLine();
        }
    }
}