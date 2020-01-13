import java.util.Scanner;

public class CalendarDates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // int Sun = 0; int Mon = 1; int Tue = 2;
        // int Wed = 3; int Thu = 4; int Fri = 5; int Sat = 6;      // Days of the week

        int Jan = 31; int Feb = 28; int Mar = 31; int Apr = 30;  // May 1 Date
        int Nov = 30; int Dec = 31;                              // Dec 1 Date    
        
        System.out.print("What day of the week was Jan. 1? Enter 0 for Sunday, 1 for Monday, and so on up to 6. ");
        int userDate = input.nextInt();
        

        int May1Date = (userDate + Jan + Feb + Mar + Apr) % 7;
        System.out.println("The day of the week of May 1 is: " + May1Date);

        int Dec1Date = (userDate + Dec + Nov) % 7;
        System.out.println("The day of the week of Dec 1 is: " + Dec1Date);  
    }
}