package Day05;

public class Test07 {
    public static void main(String[] args) {
        int[][] gugu = new int[9][9];

        for(int i = 0; i < 9; i++){
            for (int k = 0; k < 9; k++){
                gugu[i][k] = (i + 1)*(k + 1);
                System.out.print((k + 1) + " x " + (i + 1) + " = " + gugu[i][k]);
            }
            System.out.println();
        }
    }
}
