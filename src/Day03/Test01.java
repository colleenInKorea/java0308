package Day03;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" 첫번째 계산할값을 입력하세요 ");
        int triffer = scan.nextInt();
        System.out.println("<1> 덧셈 , <2> 뺄셈, <3> 곱셈, <4> 나눗셈");
        int select = scan.nextInt();
        System.out.println("두번째 계산할 값을 입력하세요");
        int triffer1 = scan.nextInt();

        int sum;
        if(select == 1){
            sum =triffer + triffer1;
            System.out.println(triffer + " + " + triffer1 + " = " + sum);
        } else if (select == 2){
            sum = triffer - triffer1;
            System.out.println(triffer + " - " + triffer1 + " = " + sum);
        } else if (select == 3){
            sum = triffer  * triffer1;
            System.out.println(triffer + " X " + triffer1 + " = " + sum);
        } else if (select == 4){
            sum = triffer  / triffer1;
            System.out.println(triffer + " / " + triffer1 + " = " + sum);
        }
    }
}
