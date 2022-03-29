package Day04;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("select your frist number");
        int number1 = scan.nextInt();

        System.out.println("Choose the operator you want");
        String operator = scan.next();

        System.out.println("select your second number");
        int number2 = scan.nextInt();

        if(operator.equals("+")){
            System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        }else if(operator.equals("-")){
            System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        }else if(operator.equals("*")){
            System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        }else if(operator.equals("/")){
            System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        }else{
            System.out.println("you chose wrong operator, rechoose the operator");
        }
    }
}
