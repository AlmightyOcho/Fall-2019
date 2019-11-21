import java.util.Scanner;

public class SillyTuition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtyFunClass;
        int qtyUnfunClass;
        int tuition;
        
        final int FUN_CLASS = 100;
        final int UNFUN_CLASS = 25;

        System.out.print("How many hours of fun classes are you taking?! ");
            qtyFunClass = input.nextInt();
        System.out.print("How many hours of un-fun classes are you taking?! ");
            qtyUnfunClass = input.nextInt();
        tuition = FUN_CLASS * qtyFunClass + qtyUnfunClass * UNFUN_CLASS;
        System.out.println("Your tuition is $" + tuition + ".");
    }
}