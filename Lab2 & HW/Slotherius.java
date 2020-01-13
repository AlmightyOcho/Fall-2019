import java.util.Scanner;
import java.util.Random;

public class Slotherius {
    public static void main(String[] args) {
        Scanner charge = new Scanner(System.in);
        Random rng = new Random();

        System.out.println("Slotherius used Triple Claw Slash!");
        System.out.print("How many seconds would you like to charge? ");
        int chrg = charge.nextInt();

        int atk1 = rng.nextInt(6) + 17;
        System.out.println("Attack 1: " + atk1);

        int atk2 = rng.nextInt(6) + 17;
        System.out.println("Attack 2: " + atk2);

        int lel = 20 - (10 * chrg);
        int lol = 20 + (15 * chrg);

        int atk3 = rng.nextInt((lol - lel) + 1) + lel;
        System.out.println("Attack 3: " + atk3);


    }
}