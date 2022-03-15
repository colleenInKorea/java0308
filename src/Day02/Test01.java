package Day02;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("첫번째 값을 입력하세요");
         int numberA = scan.nextInt();
        System.out.println("두번째 값을 입력하세요");
         int numberB = scan.nextInt();
        System.out.println("세번째 값을 입력하세요");
         int numberC = scan.nextInt();
        System.out.println("네번째 값을 입력하세요");
         int numberD = scan.nextInt();

         int sum = numberA + numberB + numberC + numberD;
        System.out.println( numberA + " + " + numberB +" + " +numberC +" + " +numberD + " = " + sum);


    }
}
