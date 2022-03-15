package Day02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberA;
        int numberB;

        //a값과 b값을 입력 받는다.
        System.out.println("a 값을 입력하세요");
        numberA = scan.nextInt();
        System.out.println("b 값을 입력하세요");
        numberB = scan.nextInt();

        // a와 b값을 연산하여 출력한다.
        int sum = numberA + numberB;
        System.out.println("a + b의 값은 " + sum + "입니다.");
        sum = numberA - numberB;
        System.out.println("a - b의 값은 " + sum + "입니다. ");
        sum = numberA * numberB;
        System.out.println("a x b 의 값은 " + sum + "입니다.");
        sum = numberA / numberB;
        //나머지 연산자를 사용하여 나눈후의 나머지를 확인한다.
        int exchange = numberA % numberB;
        System.out.println("a % b의  몫은 " + sum + "나머지는 " + exchange + " 입니다.");

    }
}
