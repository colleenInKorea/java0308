package ExtraTest;
import java.util.Scanner;

public class Test02_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String str;
        for(int i =0; i< num; i++){
            str = sc.next();
            int count =0;
            int result = 0;

            for(int j =0; j< str.length(); j++){
                if(str.charAt(j) =='O'){
                    count++;
                    result += count;
                }else count =0;
            }

            System.out.println(result);

        }

    }
}