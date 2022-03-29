package Day04;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("choose your frist number");
        int number1 = scan.nextInt();

        System.out.println("Choose the operator you want");
        String operator = scan.next();

        System.out.println("choose your second number");
        int number2 = scan.nextInt();

        double result = 0;
        if(operator.equals("+")){
            result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + (int) result);
        }else if(operator.equals("-")){
            result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + (int) result);
        }else if(operator.equals("*")){
            result = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + (int) result);
        }else if(operator.equals("/")){
            result = (double)number1 / (double)number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
        }else{
            System.out.println("you chose wrong operator, rechoose the operator");
        }
    }
}
