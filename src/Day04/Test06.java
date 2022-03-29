package Day04;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("원하는 수식을 쓰시오 (숫자와 연산자를 띄어서 써야 합니다.)");
        String [] mathEx = scan.next().split(" ");
        int number1, number2;
        char operator;


        number1 = Integer.parseInt(mathEx[0]);
        operator = mathEx[1].charAt(0);
        number2 = Integer.parseInt(mathEx[2]);

        switch (operator) {
            case '+' -> System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
            case '-' -> System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
            case '*' -> System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
            case '/' -> System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
            default -> System.out.println("연산자를 잘못입력했습니다. 다시 입력하십시오");
        }
    }
}
