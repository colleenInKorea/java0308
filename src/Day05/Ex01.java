package Day05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("숫자를 입력하시오");
            int number = scan.nextInt();

            if(number == 1) break;

            for (int i = 1; i <= 9; i++) {
                System.out.print(number + " x " + i + " = " + (number * i) + "  ");
            }
        }
    }
}
