import java.util.Scanner;

public class DistanceOnGlobe {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter lat/long of starting point (in degrees): ");

    System.out.print("Lat: ");
    double lat1 = input.nextDouble();
    System.out.print("Long: ");
    double lon1 = input.nextDouble();


    System.out.println("\nEnter lat/long of ending point (in degrees): ");

    System.out.print("Lat: ");
    double lat2 = input.nextDouble();
    System.out.print("Long: ");
    double lon2 = input.nextDouble();

    lat1 = lat1 * Math.PI / 180;
    lon1 = lon1 * Math.PI / 180;
    lat2 = lat2 * Math.PI / 180;
    lon2 = lon2 * Math.PI / 180;

    double a = Math.pow(Math.sin((lat2 - lat1) / 2.0), 2) + (Math.cos(lat1) * Math.cos(lat2)) * Math.pow(Math.sin((lon2 - lon1) / 2.0), 2);

    double distance = 2 * 3958.8 * Math.atan2(Math.sqrt(a), Math.sqrt(1.0 - a));

    System.out.println("\nDistance is " + distance + " mi.");

    }
}