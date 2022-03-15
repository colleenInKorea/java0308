package Day02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        String name;

        System.out.println("이름을 입력하시오");
        System.out.print("이름 : ");
        name = input.next();
        System.out.println();
        System.out.println("나이를 입력하시오");
        System.out.print("나이 : ");
        age = input.nextInt();
    }
}
