package Day04;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("계산할 년도는 입력 하시오");
        int year = scan.nextInt();

        if((year % 4 == 0 && year % 100 == 0) || year % 400 == 0){
            System.out.println("해당 년도는 윤년입니다. ");
        }else{
            System.out.println("해당 년도는 윤년이 아닙니다.");
        }
    }
}
