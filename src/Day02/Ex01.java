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
        System.out.print("a+b의 값은 " + sum + " 입니다.");

    }
}
