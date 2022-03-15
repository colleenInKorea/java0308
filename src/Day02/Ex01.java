package Day02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberA;
        int numberB;

        System.out.println("a 값을 입력하세요");
        numberA = scan.nextInt();
        System.out.println("b 값을 입력하세요");
        numberB = scan.nextInt();
        int sum = numberA + numberB;
        System.out.println("a+b의 값은 " + sum + " 입니다.");
        sum = numberA - numberB;
        System.out.println("a - b의 값은 " + sum + "입니다. ");
        sum = numberA * numberB;
        System.out.println("a x b 의 값은 " + sum + "입니다.");
        sum = numberA / numberB;
        int exchange = numberA % numberB;
        System.out.println("a % b의  몫은 " + sum + "나머지는 " + exchange + " 입니다.");

    }
}
