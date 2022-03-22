package Day03;

import java.io.PrintStream;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int data = 0;
        System.out.println("입력진수를 선택하시오 : <1> 10진수, <2> 16진수, <3> 8진수");
        int signal = scan.nextInt();

        System.out.print("값을 입력하시오 : ");
        String str = scan.next();

       if(signal == 1){
           data =Integer.parseInt(str, 10);
           System.out.println(data);
       }else if (signal == 2){
           data = Integer.parseInt(str, 16);
           System.out.println(data);
       }else if(signal == 3){
           data = Integer.parseInt(str, 8);
           System.out.println(data);
       }

        System.out.printf("10진수 => %d \n", data);
        System.out.printf("16진수 => %X \n", data);
        System.out.printf("8진수 => %o \n", data);
    }
}
