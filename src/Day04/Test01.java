package Day04;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("select your frist number");
        double number1 = scan.nextDouble();

        System.out.println("select your second number");
        double number2 = scan.nextDouble();

        double result = 0;
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);

        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);

        result = number1 * number2;
        System.out.println(number1 + " x " + number2 + " = " + result);

        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);

        result =(int)number1 % (int)number2;
        System.out.println((int)number1 + " % " + (int)number2 + " = " + (int)result);
    }
}
