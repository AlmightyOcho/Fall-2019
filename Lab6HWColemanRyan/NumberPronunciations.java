//I decided to use arrays for this Lab due to learning ahead about them in the zyBooks (I'm halfway done with Chapter 5).

import java.util.Scanner;

public class NumberPronunciations {

    public static String oneDigitToStr(int n) {
        String[] arr1s = new String[] {"zero", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};

        return arr1s[n];               //returns the string from arr1s[] at the n index
    }

    public static String twoDigitToStr(int n) {
        String[] arr2s = new String[] {"ten ", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety "};
        String[] arr1020s = new String[] {"eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen "};
        String num2s = "";

        if (n <= 9) {   //if less than 10, call oneDigitToStr
            num2s = oneDigitToStr(n);
        }
        else if (n % 10 == 0) {      //if n is evenly divisible by 10
            num2s = arr2s[n / 10 - 1];
        }        
        else if (n <= 19) {
            n = n % 10 - 1;
            num2s = arr1020s[n];
        }
        else {
            for (int i = 1; i <= n; i++) {    //iterates through my arr[], given the method's argument.
                if (n / 10 - 1 == i) {
                    num2s = arr2s[i] + oneDigitToStr(n % 10);
                }
            }
        }
        return num2s;
    }

    public static String threeDigitToStr(int n) {
        String[] arr3s = new String[] {"one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};
        String num3s = "";
        
        if (n < 100) {  //if n < 100, pass to twoDigitToStr method
            num3s = twoDigitToStr(n);
        }
        else if (n >= 100) {    //112
            if (n % 100 == 0) {
                num3s = arr3s[n / 100 - 1] + "hundred ";
            }
            else {
                int temp = n / 100;     //1.12, int div == one (hundred)
                num3s = arr3s[temp - 1] + "hundred " + twoDigitToStr(n % 100);
            }
        }
        return num3s;
    }

    public static String numToStr(int n) {
        String[] bigNums = new String[] {"thousand ", "million ", "billion ", "hundred "};
        String billions = "";
        String millions = "";
        String thousands = "";
        String tens = "";

            if (threeDigitToStr(n / 1000000000) == "zero") {
                billions = "";
            }
            else {
                billions = threeDigitToStr(n / 1000000000) + bigNums[2];
            }
            if (threeDigitToStr(n % 1000000000 / 1000000) == "zero") {
                millions = "";
            }            
            else {
                millions = threeDigitToStr(n % 1000000000 / 1000000) + bigNums[1];
            }
            if (threeDigitToStr(n % 1000000000 % 1000000 / 1000) == "zero") {
                thousands = "";
            }
            else {
                thousands = threeDigitToStr(n % 1000000000 % 1000000 / 1000) + bigNums[0];
            }
            if (n >= 0) {
                tens = threeDigitToStr(n % 1000000000 % 1000000 % 1000);
            }

            return billions + millions + thousands + tens;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer to pronounce (any negative value to exit): ");
            int num = input.nextInt();
            System.out.println(numToStr(num));
            System.out.println("");

            if (num < 0) {
                System.out.print("See ya later!");
                break;
            }
        }
    }
}