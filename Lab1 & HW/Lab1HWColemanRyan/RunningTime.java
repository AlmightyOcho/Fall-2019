import java.util.Scanner;

public class RunningTime {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

       System.out.println("What time did you start your run?");
    System.out.print("Hour (0-23) - ");
        int StartingHour = input.nextInt();
    System.out.print("Minute (0-59) - ");
        int StartingMinute = input.nextInt();
    System.out.print("Second (0-59) - ");
        int StartingSecond = input.nextInt();

    System.out.print("\nHow many miles did you run? ");
        int milesRan = input.nextInt();

    System.out.println("\nWhat was your per-mile pace?");
    System.out.print("Minute (0-59) - ");
        int pacePerMinute = input.nextInt();
    System.out.print("Second (0-59) - ");
        int pacePerSecond = input.nextInt();
      
    int temp1 = (StartingSecond + (milesRan * pacePerSecond));
    int endTimeSeconds = temp1 % 60;                               // int endTimeSeconds;
    
    int temp2 = (StartingMinute + (temp1 / 60) + (milesRan * pacePerMinute));
    int endTimeMinutes = (StartingMinute + (temp1 / 60) + (milesRan * pacePerMinute)) % 60;

    int endTimeHours = (StartingHour + (temp2 / 60)) % 24;

    System.out.print("Your ending time is " + endTimeHours + ":" + endTimeMinutes + ":" + endTimeSeconds);

    }
}