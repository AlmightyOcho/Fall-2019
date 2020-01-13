import java.util.Scanner;

public class MasterCardValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a card number for validation: ");
        String CCnum = input.next();        // using 2221008763790559

        if (CCnum.length() != 16 ) {
            System.out.println("Invalid!");
            }
            else {

                int a = CCnum.charAt(15) - '0';
                    
                int b = CCnum.charAt(14) - '0';
                    if (b * 2 > 9) {
                        b = b * 2 - 9;
                    }
                    else {
                        b *= 2;
                    }

                int c = CCnum.charAt(13) - '0';

                int d = CCnum.charAt(12) - '0';
                    if (d * 2 > 9) {
                        d = d * 2 - 9;
                    }
                    else {
                        d *= 2;
                    }
                    
                int e = CCnum.charAt(11) - '0';

                int f = CCnum.charAt(10) - '0';
                    if (f * 2 > 9) {
                        f = f * 2 - 9;
                    }
                    else {
                        f *= 2;
                    }

                int g = CCnum.charAt(9) - '0';
                
                int h = CCnum.charAt(8) - '0';
                    if (h * 2 > 9) {
                        h = h * 2 - 9;
                    }
                    else {
                        h *= 2;
                    }

                int i = CCnum.charAt(7) - '0';
                
                int j = CCnum.charAt(6) - '0';
                    if (j * 2 > 9) {
                        j = j * 2 - 9;
                    }
                    else {
                        j *= 2;
                    }

                int k = CCnum.charAt(5) - '0';

                int l = CCnum.charAt(4) - '0';
                    if (l * 2 > 9) {
                        l = l * 2 - 9;
                    }
                    else {
                        l *= 2;
                    }

                int m = CCnum.charAt(3) - '0';

                int n = CCnum.charAt(2) - '0';
                    if (n * 2 > 9) {
                        n = n * 2 - 9;
                    }
                    else {
                        n *= 2;
                    }

                int o = CCnum.charAt(1) - '0';

                int p = CCnum.charAt(0) - '0';
                    if (p * 2 > 9) {
                        p = p * 2 - 9;
                    }
                    else {
                        p *= 2;
                    }
                
                int sum = a + b + c + d + e + f + g + h + i + j + k + l + m + n + o + p;

                if (sum % 10 == 0) {
                    System.out.println("Valid!");
                }
                else {
                    System.out.println("Invalid!");
            }
        } 
    }             
}