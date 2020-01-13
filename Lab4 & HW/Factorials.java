import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your factorial: ");
    int num = input.nextInt();

    long result = 1;

    int i = 1;
    while (i <= num) {
        result *= i;
        System.out.println(result);
        i++;
    }

    System.out.println("Factorial of " + num + "! is: " + result);



    }
}