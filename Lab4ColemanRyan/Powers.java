import java.util.Scanner;

public class Powers {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int result = 1;

    System.out.print("Number 1: ");
        int num1 = input.nextInt();

    System.out.print("Number 2 (to the power of): ");
        int num2 = input.nextInt();
    
    int i = 1;
    while (i <= num2) {
        result = result * num1;
        i++;
    }

    System.out.println(num1 + " to the power of " + num2 + " equals: " + result);    
    }
}