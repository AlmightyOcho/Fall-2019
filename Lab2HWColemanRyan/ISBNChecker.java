import java.util.Scanner;

public class ISBNChecker {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 13-digit ISBN: ");
        long book0 = input.nextLong();

        long book13 = (book0 % 10);
        long book12 = (book0 % 100 / 10);
        long book11 = (book0 % 1000 / 100);
        long book10 = (book0 % 10000 / 1000);
        long book9 = (book0 % 100000 / 10000);
        long book8 = (book0 % 1000000 / 100000);
        long book7 = (book0 % 10000000 / 1000000);
        long book6 = (book0 % 100000000 / 10000000);
        long book5 = (book0 % 1000000000L / 100000000);
        long book4 = (book0 % 10000000000L / 1000000000);
        long book3 = (book0 % 100000000000L / 10000000000L);
        long book2 = (book0 % 1000000000000L / 100000000000L);
        long book1 = (book0 % 10000000000000L / 1000000000000L);

        long valid = (book1 + (book2*3) + book3 + (book4*3) + book5 + (book6*3) + book7
        + (book8*3) + book9 + (book10*3) + book11 + (book12*3)) % 10;

        if (valid == 10 - book13) {
            System.out.println("\nNumber is valid!");
        }
        else if (valid == 0) {
            System.out.println("\nNumber is valid!");
        }
        else {
            System.out.println("\nNumber is invalid!");
        }
    }
}