import java.util.Scanner;

public class ReverseTheNumber {

        public static void main(String[] args) {
            System.out.println("Enter number is = 324");
            int reverse = 0;
            int number = 324;
            while (number != 0) {
                reverse=reverse*10;
                reverse=reverse+number%10;
                number=number/10;
            }
            System.out.println("Then the Reverse number is= " + reverse);
        }
    }


