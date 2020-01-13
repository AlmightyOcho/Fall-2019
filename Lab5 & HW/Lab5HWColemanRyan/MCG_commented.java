import java.util.Scanner;
import java.util.Random;

public class MCG_commented {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        
        System.out.print("How many MasterCard numbers would you like to generate? ");
        int cards = input.nextInt();

        System.out.println("\nHere you go, have fun:");

        for (int y = 1; y <= cards; y++) {


            //String rand_first6 = Integer.toString(rand.nextInt() * (49999) + 222100);  //Or first 6 between 22100-272099
            //String rand_last9 = Integer.toString(rand.nextInt(999999999) + 0); 
            // randomly  pick between the 2 rangs
            int randFirstDigits = rand.nextInt(2); // (0 or 1) I'll pick 0 for the 51-55 range
            int firstDigits = 0;
            if(randFirstDigits == 0){
                firstDigits = rand.nextInt(5) + 51; //chose between 51, 52, 53, 54, 55
                //number of values = 55 - 51 +1 (5 possible values in all)
            } else {
                firstDigits = rand.nextInt(50000) + 222100; //chose between 222100 -272099
                //number of values = 272099 - 22100 +1 (50000 possible values in all)
            }

            String cardsNum = ""; //
            cardsNum = cardsNum.concat(Integer.toString(firstDigits));// add the first digits to the cardsNum

            //String Num = rand_first6 + rand_last9;
            //StringBuilder sb = new StringBuilder();

            // for loop to generate the rest of card digits till the 15th digit (index 14)
            // the remaining card digits that need to be generated 
            // starts from where my card length at till index 14
            for (int i= cardsNum.length(); i <=14; ++i){
                // the digits will be between 0-9
                cardsNum = cardsNum.concat(Integer.toString(rand.nextInt(10)));// add the digits to my current card number
            }
            
/*
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
                    h *= 2;
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
            
*/
            // time to apply Luhn formula
            // the digits that will be doubled is in even indexes
            int sum = 0;
        
            for(int i =14; i>=0;i -= 2){
                char c = cardsNum.charAt(i);
                int d = Integer.parseInt("" + c);// convert string into int
                d = d*2;
                //For each of the doubled values that exceed 9, subtract 9 
                if ( d > 9) {
                    d -= 9;
                }
                sum += d; //Add up all the doubled values

            }

            //Add up the digits that were not doubled (in the odd indexes)
            for (int i = 13; i >= 1; i -= 2){
                char c = cardsNum.charAt(i);
                int d = Integer.parseInt("" + c); // convert string into int
                sum += d;

            }

            // finding the check sum digit x (the 16th digit located at index 15)
            int x = sum % 10;
            if (x == 0){
                // if the sum % 10 == 0 then the last digit is 0
                // so just add it to the cardsNumber
                cardsNum = cardsNum.concat(Integer.toString(x));
            } else{
                x = 10 - x; 
                cardsNum = cardsNum.concat(Integer.toString(x));
            }


            System.out.println(cardsNum);


            /*if (sum % 10 == 0) {
                z = 0;
            }
            else if (x - sum >= 8) {
                z = x - sum - 1;
            }
            else if (x - sum > 5 ) {
                z = x - sum;
            }
            else if (x - sum <= 5 ) {
                z = x - sum;     
            } */

            //System.out.println(Num);
            //System.out.println(Num + sb.append(z));
            //System.out.println(sum);
            //System.out.println(x);
            //System.out.println(z);
            //System.out.println(z + sum);
        }
    }
}