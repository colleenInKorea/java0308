package Day05;

public class Test08 {
    public static void main(String[] args) {
        int[][][] array = new int[10][10][10];

        int index = 1, sum = 0;
        for(int i = 0; i < 10; i ++){
            for(int j = 0; j < 10; j++){
                for (int k = 0; k < 10; k++){
                    array[i][j][k] = index++;
                    sum += array[i][j][k];
                }
            }
        }

        System.out.println("1-1000까지 합계 : " + sum);
    }
}
