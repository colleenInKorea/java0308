package midterm;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        int i ;
        Scanner scan = new Scanner(System.in);
        i = scan.nextInt();
        if(i <0) {
            System.out.println("입력한 수는 음수(-) 입니다.");
        } else if(i > 0){
            System.out.println("입력한 수는 양수(+) 입니다.");
        }else {
            System.out.println("입력한 수는 0 입니다.");
        }
    }
}
