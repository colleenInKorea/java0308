package Day03;

import java.io.IOException;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("첫번쨰 계산할 값을 입력하시오");
        int number1 = scan.nextInt();

        System.out.println("두번째 계산할 값을 입력하시오");
        int number2 = scan.nextInt();

        System.out.println("다음중 고르시오 : +, -, x, /");
        String signal = scan.next();

        int sum;
        if(signal.equals("+") ){
            sum = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + sum);
        }else if(signal.equals("-")){
            sum = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + sum);
        }else if(signal.equals("x")){
            sum = number1 * number2;
            System.out.println(number1 + " x " + number2 + " = " + sum);
        }else if(signal.equals("/")){
            if(number2 == 0){
                System.out.println("두번째 계산할 값을 다시 설정해주세요");
            }else {
                sum = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + sum);
            }
        }

    }
}
