import java.util.Scanner;

public class AirportParking {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int charge = 0;
        int extra_min; // rollover
        int extra_day; // rollover

        System.out.print("Please enter how many minutes you have been parked: ");

        int parkd = input.nextInt();

        while (parkd >= 0) {

            if (parkd < 1440) {
                if (parkd < 30)
                    charge = 0;
                else if ((parkd > 30) && (parkd < 60))
                    charge = 2;
                else if (parkd > 60) {
                    if (parkd % 30 > 0)
                        charge = 1 + (parkd / 30) * 1;
                    else
                        charge = (parkd / 30) * 1;
                    if (charge > 24)
                        charge = 24;
                }
            } else {
                extra_min = parkd % 1440;

                if (extra_min < 30)
                    charge = 0;
                else if ((extra_min > 30 && extra_min < 60))
                    charge = 2;
                else if (extra_min > 60) {

                    if (extra_min % 30 > 0)
                        charge = 1 + (extra_min / 30) * 1;

                    else charge = (extra_min / 30) * 1;

                    if (charge > 24)
                        charge = 24;
                }

                extra_day = parkd / 1440;
                charge = charge + extra_day * 24;
            }


            System.out.println("Your charge is $" + charge);
            System.out.print("Enter number of minutes parked : "); // repeat
            parkd = input.nextInt();
        }
        if (parkd < 0) {
            System.out.println("It seems you've parked back in time, however, we do not have the technology to calculate -- try again.");
        }
    }
}