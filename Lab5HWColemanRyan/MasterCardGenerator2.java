import java.util.Scanner;
import java.util.Random;

public class MasterCardGenerator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        
        System.out.print("How many MasterCard numbers would you like to generate? ");
        int cards = input.nextInt();

        System.out.println("\nHere you go, have fun:");

        for (int y = 1; y <= cards; y++) {

            String rand_first6 = Integer.toString(rand.nextInt(49999) + 222100);  //Or first 6 between 22100-272099
            String rand_last9 = Integer.toString(rand.nextInt(999999999) + 0); 

            String Num = rand_first6 + rand_last9;
            StringBuilder sb = new StringBuilder();
            

            int b = Num.charAt(14) - '0';
                if (b * 2 > 9) {
                    b = b * 2 - 9;
                }
                else {
                    b *= 2;
                }

            int c = Num.charAt(13) - '0';

            int d = Num.charAt(12) - '0';
                if (d * 2 > 9) {
                    d = d * 2 - 9;
                }
                else {
                    d *= 2;
                }
                
            int e = Num.charAt(11) - '0';

            int f = Num.charAt(10) - '0';
                if (f * 2 > 9) {
                    f = f * 2 - 9;
                }
                else {
                    f *= 2;
                }

            int g = Num.charAt(9) - '0';
            
            int h = Num.charAt(8) - '0';
                if (h * 2 > 9) {
                    h = h * 2 - 9;
                }
                else {
                    h *= 2;
                }

            int i = Num.charAt(7) - '0';
            
            int j = Num.charAt(6) - '0';
                if (j * 2 > 9) {
                    j = j * 2 - 9;
                }
                else {
                    j *= 2;
                }

            int k = Num.charAt(5) - '0';

            int l = Num.charAt(4) - '0';
                if (l * 2 > 9) {
                    l = l * 2 - 9;
                }
                else {
                    l *= 2;
                }

            int m = Num.charAt(3) - '0';

            int n = Num.charAt(2) - '0';
                if (n * 2 > 9) {
                    n = n * 2 - 9;
                }
                else {
                    n *= 2;
                }

            int o = Num.charAt(1) - '0';

            int p = Num.charAt(0) - '0';
                if (p * 2 > 9) {
                    p = p * 2 - 9;
                }
                else {
                    p *= 2;
                }

            int sum = b + c + d + e + f + g + h + i + j + k + l + m + n + o + p;       

            int x = sum + (10 - sum % 10);

            int z = x - sum;
            


            if (sum % 10 == 0) {
                z = 0;
            }
            else {
                z = x - sum;
            }

            System.out.println(Num + sb.append(z));
        }
    }
}