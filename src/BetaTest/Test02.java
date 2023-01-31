package BetaTest;

public class Test02 {
    public int solution(int[] arr, int[] arr2){
        int answer = 0;
        for (int i =0; i < arr.length; i++){
            if(arr2[i] >= 29){
                arr2[i] = 21;
            }
            answer += arr2[i] - arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Test02 test = new Test02();
        int[] arr1 = {9, 9, 9, 9, 7, 9, 8};
        int[] arr2 = {23, 23, 30, 28, 30, 23, 23};
        System.out.println(test.solution(arr1, arr2));
    }
}
