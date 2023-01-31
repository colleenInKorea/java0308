package ExtraTest;

import java.util.Scanner;

public class Test02 {
    public int solution ( String str ){
        int count = 0;
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'O'){
                count++;
            }else {
                count = 0;
            }
            sum+= count;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Test02 test = new Test02();
        String str = scan.next();
        System.out.println(test.solution( str));
    }
}
