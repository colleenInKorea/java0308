package Day03;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("정수를 입력하시오");
        int number = scan.nextInt();

        System.out.printf("10진수 => %d \n",number);
        System.out.printf("16진수 => %X \n", number);
        System.out.printf("8진수 => %o \n", number);
    }
}
