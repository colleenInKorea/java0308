package Day05;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("문자열을 입력하시오");
        String dumiString = scan.nextLine();

        int upperCount = 0, lowCount = 0, digitCount = 0;
        for (int i = 0; i < dumiString.length(); i++ ){
            char ch = dumiString.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                upperCount++;
            }else if( ch >= 'a' && ch <= 'z'){
                lowCount++;
            }else if( ch >= '0' && ch <= '9'){
                digitCount++;
            }
        }

        System.out.println("대문자 : " + upperCount + "개, 소문자 : " + lowCount + "개, 숫자 : " + digitCount + "개 ");

    }
}
