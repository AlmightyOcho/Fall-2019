import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");

        int month = input.nextInt();
        int days;

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        }
        else if (month == 2) {
            days = 28;
        }
        else { 
            days = 31;
        }

        System.out.print("Enter year (1000-3000): ");

        int year = input.nextInt();

        if (year >= 1000) {
            if (year % 400 == 0 || year % 4 == 0) {
                if (month == 2) {
                    days = 29;
                }
            }
            if (year % 100 == 0) {
                if (month == 2) {
                    days = 28;
                }
            }
        }

        if (month < 1 || month > 12) {
            System.out.println("Error - month and/or year out of bounds.");
        }
        else {
            System.out.println(month + "/" + year + " contains " + days + " days.");
        }
    } 
}

