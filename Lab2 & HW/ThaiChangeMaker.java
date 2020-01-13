import java.util.Scanner;

public class ThaiChangeMaker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of baht: ");
        int amnt = input.nextInt();
        
        int thou = (amnt / 1000);
        System.out.println("1000 baht bills: " + thou);
        
        thou = (amnt % 1000 / 500);
        System.out.println("500 baht bills: " + thou);

        thou = (amnt % 1000 % 500 / 100);
        System.out.println("100 baht bills: " + thou);

        thou = (amnt % 1000 % 500 % 100 / 50);
        System.out.println("50 baht bills: " + thou);

        thou = (amnt % 1000 % 500 % 100 % 50 / 20);
        System.out.println("20 baht bills: " + thou);

        thou = (amnt % 1000 % 500 % 100 % 50 % 20 / 10);
        System.out.println("10 baht bills: " + thou);

        thou = (amnt % 1000 % 500 % 100 % 50 % 20 % 10 / 5);
        System.out.println("5 baht bills: " + thou);

        thou = (amnt % 1000 % 500 % 100 % 50 % 20 % 10 % 5 / 2);
        System.out.println("2 baht bills: " + thou);

        thou = (amnt % 1000 % 500 % 100 % 50 % 20 % 10 % 5 % 2 / 1);
        System.out.println("1 baht bills: " + thou);

    }
}