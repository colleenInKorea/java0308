package ExtraTest;

public class Test02 {
    public int solution (char[] arr){
        int count = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'O'){
                count++;
            }else {
                count = 0;
            }
            sum+= count;
        }
        return sum;
    }

    public static void main(String[] args) {
        Test02 test = new Test02();
        char[] arr ={'O', 'O', 'X', 'X', 'O', 'X','X', 'O', 'O', 'O'};
        System.out.println(test.solution(arr));
    }
}
