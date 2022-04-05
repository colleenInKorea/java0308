package Day05;

public class Test01 {
    public static void main(String[] args) {
        //구구단 출력하기
        for(int i = 1; i < 10; i ++){
            System.out.println();
            for (int j = 1; j < 10; j++){
                System.out.print(i + " x " + j + " = " + (i * j) + "  ");
            }
        }
    }
}
